package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public interface MidTierMonster extends LowTierMonster {
    public Skill sideSkill();
}
