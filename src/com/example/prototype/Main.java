package com.example.prototype;

import com.example.prototype.stamps.PeaceStamp;
import com.example.prototype.stamps.RainbowStamp;
import com.example.prototype.stamps.StarStamp;
import com.example.prototype.stamps.TreeStamp;

public class Main {
    public static void main(String[] args) {
        String endl = System.lineSeparator();

        // for test
        System.out.println(StampPrototypeFactory.get(1));
        System.out.println(StampPrototypeFactory.get(0));
        System.out.println(StampPrototypeFactory.get(2));

        StampPrototypeFactory.updatePrototype(4, new StarStamp("#f1c40f"));
        StampPrototypeFactory.updatePrototype(5, new TreeStamp("#2980b9"));
        StampPrototypeFactory.updatePrototype(6, new RainbowStamp("#ecf0f1"));
        StampPrototypeFactory.updatePrototype(7, new PeaceStamp("#95a5a6"));

        FairyWorld fw = new FairyWorld();
        fw.photoBoothShoot(new Integer[] {3,4,2,1,1,2,5,6,7});
    }
}
