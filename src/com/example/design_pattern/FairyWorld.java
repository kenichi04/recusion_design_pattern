package com.example.design_pattern;

import com.example.design_pattern.factory.PlayfulPetAssistant;

public class FairyWorld {
    public void rentPet(PlayfulPetAssistant assistant, Person person) {
        System.out.println("Thank you for your pet rental!");
        double costs = assistant.runAssistanceTour(person);
        System.out.println(costs + " dollars were charged to " + person.getName() + "'s credit card.");
        System.out.println("xxxxxxxxxxxxxxxxxxxx" + System.lineSeparator());
    }
}
