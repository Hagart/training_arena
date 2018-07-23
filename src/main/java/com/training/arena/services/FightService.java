package com.training.arena.services;

import com.training.arena.models.Creature;

import java.util.Random;

public class FightService {

    private Random random = new Random();
    private int random(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

    public void fight(Creature c1, Creature c2){


        int c1Initiative = c1.getInitiative() + random(0,10);
        int c2Initiative = c2.getInitiative() + random(0,10);

        System.out.println("-------------------------------------------"+c1.getLifePoints()+"-"+c2.getLifePoints());

        if (c1Initiative > c2Initiative){
            int attackDamage = c1.attack(c2);
            if (attackDamage > 0) {
                c2.dodge(attackDamage, c1);
            }
            if (c2.getLifePoints() > 0) {
                attackDamage = c2.attack(c1);
                if (attackDamage > 0) {
                    c1.dodge(attackDamage, c2);
                }
            }
        }
        else {
            int attackDamage = c2.attack(c1);
            if (attackDamage > 0) {
                c1.dodge(attackDamage, c2);
            }
            if (c1.getLifePoints() > 0) {
                attackDamage = c1.attack(c2);
                if (attackDamage > 0) {
                    c2.dodge(attackDamage, c1);
                }
            }
        }

    }
}
