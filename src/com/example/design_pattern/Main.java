package com.example.design_pattern;

import com.example.design_pattern.factory.PlayfulCatAssistant;
import com.example.design_pattern.factory.PlayfulDogAssistant;
import com.example.design_pattern.factory.PlayfulRabbitAssistant;

public class Main {
    public static void main(String[] args) {
        FairyWorld fairyWorld = new FairyWorld();
        Person jessica = new Person("Jessica", "Roller",
                30, 1.65, 95, "female");

        fairyWorld.rentPet(new PlayfulCatAssistant(), jessica);
        fairyWorld.rentPet(new PlayfulDogAssistant(), jessica);
        fairyWorld.rentPet(new PlayfulRabbitAssistant(), jessica);
    }
}
