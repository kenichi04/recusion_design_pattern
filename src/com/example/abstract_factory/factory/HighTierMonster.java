package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public interface HighTierMonster extends MidTierMonster {
    Skill[] sideSkills();
}
