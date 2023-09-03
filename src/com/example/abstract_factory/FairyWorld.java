package com.example.abstract_factory;

import com.example.abstract_factory.factory.*;

public class FairyWorld {
    public void playLaserTag(Person person, LaserTagMonsterFactory factory) {
        String end1 = System.lineSeparator();
        System.out.println(person + " will now play laser tag!" + end1);

        LowTierMonster lowMon = factory.createLowTierMonster();
        System.out.println("Fighting " + lowMon + "....Defeated." + end1);
        MidTierMonster midMon = factory.createMidTierMonster();
        System.out.println("Fighting " + midMon + "....Defeated." + end1);
        HighTierMonster highMon = factory.createHighTierMonster();
        System.out.println("Fighting " + highMon + "....Defeated." + end1);
        FlyingMonster flyMon = factory.createFlyingMonster();
        System.out.println("Fighting " + flyMon + "....Defeated." + end1);
        HybridMonster hybridMon = factory.createHybridMonster();
        System.out.println("Fighting " + hybridMon + "....Defeated." + end1);
        FinalBossMonster finalMon = factory.createFinalBossMonster();
        System.out.println("Fighting " + finalMon + "....Defeated." + end1);

        System.out.println("Congratulations! All monsters were defeated!" + end1);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx" + end1);
    }
}
