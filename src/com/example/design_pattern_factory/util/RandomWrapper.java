package com.example.design_pattern_factory.util;

import java.util.Random;

public class RandomWrapper {
    public static double getRanDouble(double min, double max) {
        Random r = new Random();
        double val = min + (max - min) * r.nextDouble();
        return val;
    }

    public static boolean ranBoolean() {
        return new Random().nextBoolean();
    }
}
