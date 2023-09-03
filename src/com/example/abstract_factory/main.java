package com.example.abstract_factory;

import com.example.abstract_factory.factory.GenericLaserTagMonsterFactory;

public class main {
    public static void main(String[] args) {
        FairyWorld fairyWorld = new FairyWorld();
        Person jessica = new Person("Jessica", "Roller",
                30, 1.65, 95, "feamale");

        fairyWorld.playLaserTag(jessica, new GenericLaserTagMonsterFactory());
    }
}
