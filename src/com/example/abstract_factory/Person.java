package com.example.abstract_factory;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double heightM;
    private double weightKg;
    private String biologicalSex;

    public Person(String firstName, String lastName, int age,
                  double heightM, double weightKg, String biologicalSex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heightM = heightM;
        this.weightKg = weightKg;
        this.biologicalSex = biologicalSex;
    }

    public String getName() {
        return this.firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
