package com.training.arena.models;

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

    public int attack(Creature target){return 0;}
    public void dodge(int potentialDamage, Creature attacker){}

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
