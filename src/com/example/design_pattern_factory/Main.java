package com.example.design_pattern_factory;

import com.example.design_pattern_factory.factory.PlayfulCatAssistant;
import com.example.design_pattern_factory.factory.PlayfulDogAssistant;
import com.example.design_pattern_factory.factory.PlayfulRabbitAssistant;

public class Main {
    public static void main(String[] args) {
        FairyWorld fairyWorld = new FairyWorld();
        // set up PlayfulPetAssistants
        fairyWorld.addPlayfulPetAssistant("cat", new PlayfulCatAssistant());
        fairyWorld.addPlayfulPetAssistant("dog", new PlayfulDogAssistant());
        fairyWorld.addPlayfulPetAssistant("rabbit", new PlayfulRabbitAssistant());

        Person jessica = new Person("Jessica", "Roller",
                30, 1.65, 95, "female");

        fairyWorld.rentPet("cat", jessica, 1, "all-rounder pack");
        fairyWorld.rentPet("dog", jessica, 1, "all-rounder pack");
        fairyWorld.rentPet("rabbit", jessica, 1, "all-rounder pack");
    }
}
