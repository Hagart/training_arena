package com.training.arena;

import com.training.arena.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CreaturesFactory {

    private Random random = new Random();

    Creature generate(CreatureType type, int strength, int value){
        switch (type){
            case ELF: return new Elf(strength,value,value,value,value,value,value,value);
            case DWARF: return new Dwarf(strength,value,value,value,value,value,value,value);
            case HALFLING: return new Halfling(strength,value,value,value,value,value,value,value);
            case HUMAN: return new Human(strength,value,value,value,value,value,value,value);
            case ORC: return new Orc(strength,value,value,value,value,value,value,value);
            default: return new Troll(strength,value,value,value,value,value,value,value);
        }
    }

    private CreatureType randomCreatureType(){
        int creatureTypeNumber = CreatureType.values().length;
        int idx = random.nextInt(creatureTypeNumber);
        return CreatureType.values()[idx];

    }

    private int random(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

    Creature randomCreature(){
        CreatureType randomType = randomCreatureType();
        int randomStrength = random(10,20);
        int randomValue = random(10,20);
        return generate(randomType, randomStrength, randomValue);
    }

    List<Creature> randomCreatureList(int listSize){
        List<Creature> creatureList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            creatureList.add(randomCreature());
        }
        return creatureList;
    }
}
