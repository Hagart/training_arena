package com.training.arena.models;

public class Halfling extends Creature {

    public Halfling(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
                    Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(CreatureType.HALFLING, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
