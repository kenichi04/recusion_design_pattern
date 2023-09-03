package com.example.abstract_factory.factory;

// Abstract Factory
public interface LaserTagMonsterFactory {
    LowTierMonster createLowTierMonster();
    MidTierMonster createMidTierMonster();
    HighTierMonster createHighTierMonster();
    FlyingMonster createFlyingMonster();
    HybridMonster createHybridMonster();
    FinalBossMonster createFinalBossMonster();
}
