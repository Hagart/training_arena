package com.training.arena.models;

public enum BodyPart {
    HEAD (5, 3),
    LEFT_ARM (10, 1),
    RIGHT_ARM (10, 1),
    TRUNK (30, 0),
    LEFT_LEG(5, 2),
    RIGHT_LEG (5, 2);

    private final int hitChance;
    private final int bonusDamage;

    BodyPart(int hitChance, int bonusDamage){
        this.hitChance = hitChance;
        this.bonusDamage = bonusDamage;
    }

    public int getHitChance() {
        return hitChance;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }
}
