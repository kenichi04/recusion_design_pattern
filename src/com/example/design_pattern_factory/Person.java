package com.example.design_pattern_factory;

import com.example.design_pattern_factory.util.Name;

public class Person extends Mammal {
    public static final String SPECIES = "Human";
    public static final double LIFE_EXPECTANVY = 30000;
    public static final double BODY_TEMPERATURE = 36;

    private Name name;
    private int age;

    public Person(String firstName, String lastName, int age, double heightM, double weightKg, String biologicalSex) {
        super(Person.SPECIES, heightM, weightKg, Person.LIFE_EXPECTANVY, biologicalSex, Person.BODY_TEMPERATURE);
        this.name = new Name(firstName, lastName);
        this.age = age;
    }

    public String getName() {
        return this.name.toString();
    }

    public String toString() {
        return super.toString() + ". The name of this Person is " + this.getName();
    }
}
