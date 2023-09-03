package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public interface FlyingMonster extends HighTierMonster {
    Skill mainFlySkill();
    Skill[] flySideSkills();
    Skill[] getFlyingSkills();
    int getFlySpeed();
    String flyAnimation();
}
