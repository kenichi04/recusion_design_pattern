package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

public interface Monster {
    int getHp();
    int getAttack();
    int getDefence();
    int getLevel();
    int getPoints();
    int getMovementSpeed();
    String getMonsterName();
    String getAppearance();
    String kill();
    Skill[] getSpecialSkill();

}
