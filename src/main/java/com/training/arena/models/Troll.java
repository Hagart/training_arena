package com.training.arena.models;

public class Troll extends Creature {

    public Troll(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
                 Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(CreatureType.TROLL, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
