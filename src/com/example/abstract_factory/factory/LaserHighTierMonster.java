package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

import java.util.Arrays;

public class LaserHighTierMonster
        extends LaserMidTierMonster implements HighTierMonster {
    public LaserHighTierMonster(int hp, int attack, int defense, int level,
                                int points, int movementSpeed) {
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserHighTierMonster(int level) {
        super(level);
    }

    @Override
    public Skill[] sideSkills() {
        return Arrays.copyOfRange(this.specialSkills, 1, this.specialSkills.length);
    }

    @Override
    protected void setInitialSkills() {
        Skill[] s = {
            new Skill(this.attack, "Generic attack"),
            new Skill(this.attack * 2, "Generic side attack"),
            new Skill(this.attack * 3, "Generic side attack 2")
        };
        this.setSpecialSkills(s);
    }

    @Override
    public String toString() {
        return "Generic High Tier Monster";
    }
}
