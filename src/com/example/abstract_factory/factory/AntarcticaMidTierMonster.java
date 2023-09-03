package com.example.abstract_factory.factory;

public class AntarcticaMidTierMonster extends LaserMidTierMonster {
    public AntarcticaMidTierMonster(int hp, int attack, int defense, int level,
                                    int points, int movementSpeed) {
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public AntarcticaMidTierMonster(int level) {
        super(level);
    }

    @Override
    public String getMonsterName() {
        return "Antarctica Ice Mid Tier Monster";
    }
}
