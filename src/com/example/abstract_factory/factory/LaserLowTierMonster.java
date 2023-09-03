package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public class LaserLowTierMonster
        extends LaserMonster implements LowTierMonster {
    public LaserLowTierMonster(int hp, int attack, int defense, int level,
                               int points, int movementSpeed) {
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserLowTierMonster(int level) {
        super(level);
    }

    @Override
    public Skill mainSkill() {
        return this.specialSkills[0];
    }

    @Override
    public String getMonsterName() {
        return "Generic Low Tier Monster";
    }
}
