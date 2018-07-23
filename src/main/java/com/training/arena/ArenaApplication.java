package com.training.arena;

import java.util.List;

import com.training.arena.models.Creature;
import com.training.arena.services.FightService;

public class ArenaApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		List<Creature> creatureList = new CreaturesFactory().randomCreatureList(3);
//
		for (Creature creature: creatureList){
            System.out.println("Creature: " + creature.toString().replace('\n', ' '));
        }
        new FightService().fight(creatureList.get(0), creatureList.get(1));
	}
}
