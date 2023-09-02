package com.example.design_pattern_factory.util;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

