package com.training.arena.services;

import com.training.arena.models.Creature;

public interface Fightable {
    int attack(Creature target);
    void dodge(int potentialDamage, Creature attacker);
}
