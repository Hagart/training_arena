package com.training.arena.models;

import com.training.arena.RandomUtil;
import com.training.arena.services.Fightable;

public abstract class Creature implements Fightable {
    private Integer strength;
    private Integer dexterity;
    private Integer initiative;
    private Integer velocity;
    private Integer endurance;
    private Integer numberOfAttacks;
    private Integer numberOfDodges;
    private Integer lifePoints;
    private CreatureType creatureType;

    Creature(CreatureType creatureType, Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
                         Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints){
        this.creatureType = creatureType;
        this.strength = strength;
        this.dexterity = dexterity;
        this.initiative = initiative;
        this.velocity = velocity;
        this.endurance = endurance;
        this.numberOfAttacks = numberOfAttacks;
        this.numberOfDodges = numberOfDodges;
        this.lifePoints = lifePoints;
    }

    public int attack(Creature target){
        try {
            int potentialDamage = this.strength + RandomUtil.random(0,3) + hitBodyPart().getBonusDamage();

            System.out.println("Good Attack! Will " + creatureType + " hit for " + potentialDamage + " damage?");
            return potentialDamage;
        }
        catch (NullPointerException exc){
            try {
                if (isSuccessfulSecondaryAttack()) {
                    int potentialDamage = this.strength + RandomUtil.random(0, 3) + hitBodyPart().getBonusDamage();

                    System.out.println("Good Secondary Attack! Will " + creatureType + " hit for " + potentialDamage + " damage?");
                    return potentialDamage;
                } else {
                    System.out.println(creatureType + " missed!");
                    return 0;
                }
            }
            catch (NullPointerException exc1){
                return 0;
            }
        }
    }
    public void dodge(int potentialDamage, Creature attacker){
        if (isSuccessfulDodge()){
            System.out.println("Haha! " + creatureType + " dodged!");
        }
        else {
            int actualDamage = potentialDamage - endurance;
            if (actualDamage > 0){
                lifePoints -= actualDamage;
                System.out.println(creatureType + " lost " + actualDamage + " life points");
            }
        }
        if (lifePoints < 1){
            System.out.println(creatureType + " fainted!");
        }
    }

    private boolean isSuccessfulDodge(){
        return initiative > RandomUtil.random(1,20);
    }

    private boolean isSuccessfulSecondaryAttack(){
        return dexterity > RandomUtil.random(1,20);
    }

    private BodyPart hitBodyPart(){
        int bodyParts = BodyPart.values().length;
        int randomIdx = RandomUtil.random(0, bodyParts);
        if (randomIdx == bodyParts){
            throw new NullPointerException();
        }
        else {
            System.out.println(BodyPart.values()[randomIdx] + " hit!");
            return BodyPart.values()[randomIdx];
        }
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public Integer getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public Integer getNumberOfDodges() {
        return numberOfDodges;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public String getCreatureType() {
        return creatureType.toString();
    }

    @Override
    public String toString() {
        return creatureType + " {" +
                "\n\tstrength=" + strength +
                "\n\t, dexterity=" + dexterity +
                "\n\t, initiative=" + initiative +
                "\n\t, velocity=" + velocity +
                "\n\t, endurance=" + endurance +
                "\n\t, numberOfAttacks=" + numberOfAttacks +
                "\n\t, numberOfDodges=" + numberOfDodges +
                "\n\t, lifePoints=" + lifePoints +
                "\n}";
    }
}
