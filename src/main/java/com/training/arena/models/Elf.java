package com.training.arena.models;

public class Elf extends Creature {

    public Elf(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance,
               Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(CreatureType.ELF, strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints);
    }
}
