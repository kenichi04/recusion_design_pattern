package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public class LaserMidTierMonster
        extends LaserLowTierMonster implements MidTierMonster {
    public LaserMidTierMonster(int hp, int attack, int defense, int level,
                               int points, int movementSpeed) {
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserMidTierMonster(int level) {
        super(level);
    }

    @Override
    public Skill sideSkill() {
        return this.specialSkills[1];
    }

    @Override
    protected void setInitialSkills() {
        Skill[] s = {
                new Skill(this.attack, "Generic attack"),
                new Skill(this.attack*2, "Generic side attack")
        };
        this.setSpecialSkills(s);
    }

    @Override
    public String getMonsterName() {
        return "Generic Mid Tier Monster";
    }
}
