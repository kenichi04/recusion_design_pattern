package com.example.design_pattern_factory.factory;

import com.example.design_pattern_factory.util.RandomWrapper;

import java.util.ArrayList;
import java.util.List;

public class PlayfulDogAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet() {
        return new Dog(RandomWrapper.getRanDouble(0.15, 1.3),
                RandomWrapper.getRanDouble(9.5, 25.8),
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
