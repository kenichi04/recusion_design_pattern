package com.example.design_pattern_factory.factory;

import com.example.design_pattern_factory.Person;

public interface PlayfulPet {
    abstract String play();
    abstract String playWithPerson(Person person);
    abstract String playNoise();
    abstract String getPetName();
    abstract double getRentalCosts();
    abstract boolean likesActivity(String activity);
    abstract boolean dislikesActivity(String activity);
    abstract String doActivity(String activity);
}
