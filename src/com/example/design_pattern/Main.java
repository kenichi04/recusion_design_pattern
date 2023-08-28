package com.example.design_pattern;

import com.example.design_pattern.factory.PlayfulCatAssistant;

public class Main {
    public static void main(String[] args) {
        FairyWorld fairyWorld = new FairyWorld();
        Person jessica = new Person("Jessica", "Roller",
                30, 1.65, 95, "female");

        fairyWorld.rentPet(new PlayfulCatAssistant(), jessica);
    }
}
