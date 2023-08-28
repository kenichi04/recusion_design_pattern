package com.example.design_pattern.factory;

import com.example.design_pattern.Person;

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
