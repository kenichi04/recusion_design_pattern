package com.example.design_pattern;

import com.example.design_pattern.factory.PlayfulPetAssistant;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FairyWorld {
    private Map<String, PlayfulPetAssistant> assistantMap = new HashMap<>();

    public void rentPet(PlayfulPetAssistant assistant, Person person) {
        System.out.println("Thank you for your pet rental!");
        double costs = assistant.runAssistanceTour(person);
        System.out.println(costs + " dollars were charged to " + person.getName() + "'s credit card.");
        System.out.println("xxxxxxxxxxxxxxxxxxxx" + System.lineSeparator());
    }

    public void rentPet(String petKey, Person person, int amount, String tour) {
        PlayfulPetAssistant assistant = assistantMap.get(petKey);
        if (Objects.isNull(assistant)) {
            System.out.println("Fairy World can not rent " + petKey + ".");
            return;
        }
        System.out.println("Thank you for your pet(s) rental!");
        System.out.println("We will rent " + amount + " " + petKey + "(s).");
        double costs = assistant.runAssistanceTour(person, tour, amount);
        System.out.println(costs + " dollars were charged to " + person.getName() + "'s credit card.");
        System.out.println("xxxxxxxxxxxxxxxxxxxx" + System.lineSeparator());
    }

    public void addPlayfulPetAssistant(String petKey, PlayfulPetAssistant assistant) {
        this.assistantMap.put(petKey, assistant);
    }
}
