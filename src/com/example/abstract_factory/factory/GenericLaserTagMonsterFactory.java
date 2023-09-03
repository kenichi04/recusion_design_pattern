package com.example.abstract_factory.factory;

import com.example.abstract_factory.RandomWrapper;

public class GenericLaserTagMonsterFactory implements LaserTagMonsterFactory {
    @Override
    public LowTierMonster createLowTierMonster() {
        return new LaserLowTierMonster(RandomWrapper.getRan(1, 20));
    }

    @Override
    public MidTierMonster createMidTierMonster() {
        return new LaserMidTierMonster(RandomWrapper.getRan(5, 30));
    }

    @Override
    public HighTierMonster createHighTierMonster() {
        return new LaserHighTierMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public FlyingMonster createFlyingMonster() {
        return new LaserFlyingMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public HybridMonster createHybridMonster() {
        return new LaserHybridMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public FinalBossMonster createFinalBossMonster() {
        return new LaserFinalBossMonster(RandomWrapper.getRan(40, 100));
    }
}
