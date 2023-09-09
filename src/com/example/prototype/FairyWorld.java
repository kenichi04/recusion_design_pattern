package com.example.prototype;

public class FairyWorld {
    public void photoBoothShoot(Integer[] stampSlots) {
        String endl = System.lineSeparator();

        for (int i = 0; i < stampSlots.length; i++) {
            System.out.println("Stamp - " + StampPrototypeFactory.get(stampSlots[i]) + " used in the photoshoot!");
        }
    }
}
