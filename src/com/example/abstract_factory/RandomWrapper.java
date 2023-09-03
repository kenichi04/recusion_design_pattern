package com.example.abstract_factory;

import java.util.Random;

public class RandomWrapper {
    public static int getRan(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static boolean ranBoolean() {
        return new Random().nextBoolean();
    }
}
