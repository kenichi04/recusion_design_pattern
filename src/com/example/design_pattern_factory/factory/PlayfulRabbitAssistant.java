package com.example.design_pattern_factory.factory;

import com.example.design_pattern_factory.util.RandomWrapper;

import java.util.ArrayList;
import java.util.List;

public class PlayfulRabbitAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet() {
        return new Rabbit(RandomWrapper.getRanDouble(0.15, 0.4),
                RandomWrapper.getRanDouble(2.2, 10.2),
                RandomWrapper.ranBoolean() ? "male" : "female");
    }

    @Override
    public List<PlayfulPet> createPlayfulPets(int amount) {
        List<PlayfulPet> pets = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            PlayfulPet p = createPlayfulPet();
            pets.add(p);
        }
        return pets;
    }
}
