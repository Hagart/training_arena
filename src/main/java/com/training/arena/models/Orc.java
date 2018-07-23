package com.training.arena.models;

public class Orc extends Creature {

    public Orc(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
               Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(CreatureType.ORC, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
