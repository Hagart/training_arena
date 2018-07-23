package com.training.arena;

import java.util.List;

import com.training.arena.models.Creature;
import com.training.arena.services.FightService;

public class ArenaApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		List<Creature> creatureList = new CreaturesFactory().randomCreatureList(2);
		FightService fightService = new FightService();
//
		while (creatureList.get(0).getLifePoints() > 0 && creatureList.get(1).getLifePoints() > 0){
		    fightService.fight(creatureList.get(0), creatureList.get(1));
        }

	}
}
