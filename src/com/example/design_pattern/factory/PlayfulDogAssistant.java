package com.example.design_pattern.factory;

import com.example.design_pattern.util.RandomWrapper;

public class PlayfulDogAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet() {
        return new Dog(RandomWrapper.getRanDouble(0.15, 1.3),
                RandomWrapper.getRanDouble(9.5, 25.8),
                RandomWrapper.ranBoolean() ? "male" : "female");
    }
}
