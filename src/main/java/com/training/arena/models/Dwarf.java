package com.training.arena.models;

public class Dwarf extends Creature {

    public Dwarf(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
                 Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {

        super(CreatureType.DWARF, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
