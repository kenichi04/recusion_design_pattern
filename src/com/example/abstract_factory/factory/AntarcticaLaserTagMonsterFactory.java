package com.example.abstract_factory.factory;

import com.example.abstract_factory.RandomWrapper;

public class AntarcticaLaserTagMonsterFactory implements LaserTagMonsterFactory {
    @Override
    public LowTierMonster createLowTierMonster() {
        return new AntarcticaLowTierMonster(RandomWrapper.getRan(1, 20));
    }

    @Override
    public MidTierMonster createMidTierMonster() {
        return new AntarcticaMidTierMonster(RandomWrapper.getRan(5, 30));
    }

    @Override
    public HighTierMonster createHighTierMonster() {
        return new AntarcticaHighTierMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public FlyingMonster createFlyingMonster() {
        return new AntarcticaFlyingMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public HybridMonster createHybridMonster() {
        return new AntarcticaHybridMonster(RandomWrapper.getRan(15, 50));
    }

    @Override
    public FinalBossMonster createFinalBossMonster() {
        return new AntarcticaFinalBossMonster(RandomWrapper.getRan(40, 100));
    }
}
