package com.training.arena.models;

public class Human extends Creature {

    public Human(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
                 Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(CreatureType.HUMAN, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
