package com.example.design_pattern_factory.factory;

import com.example.design_pattern_factory.Mammal;
import com.example.design_pattern_factory.Person;

import java.util.Arrays;

public class Rabbit extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Rabbit";
    public static final double LIFE_EXPECTANCY = 3000;
    public static final double BODY_TEMPERATURE = 40;

    private static final double PLAYFUL_HOURLY_COSTS = 30;
    private static final String[] LIKED_ACTIVITIES = {"eat","nap","chase","drink","jump","dig"};
    private static final String[] DISLIKED_ACTIVITIES = {"bath","dressup"};

    public Rabbit(double heightM, double weightKg, String biologicalSex) {
        super(Rabbit.SPECIES, heightM, weightKg, Rabbit.LIFE_EXPECTANCY, biologicalSex, Rabbit.BODY_TEMPERATURE);
    }

    public String toString() {
        return super.toString() + " this is a rabbit";
    }

    public void woof() {
        System.out.println("Squeak Squeak");
    }

    @Override
    public String getPetName() {
        return this.species;
    }

    @Override
    public String play() {
        return "This rabbit starts jumping around and chases an insect on the grass.";
    }

    @Override
    public String playWithPerson(Person person) {
        String s = "The bunny hops towards " + person.getName();
        s += ". After the rabbit stares at " + person.getName() + ", "
            + person.getName()  + " makes the rabbit chase a small carrot. The rabbit hops towards it.";
        return s;
    }

    @Override
    public String playNoise() {
        return "Squeak";
    }

    @Override
    public double getRentalCosts() {
        return this.PLAYFUL_HOURLY_COSTS;
    }

    @Override
    public boolean likesActivity(String activity) {
        return Arrays.asList(this.LIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public boolean dislikesActivity(String activity) {
        return Arrays.asList(this.DISLIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public String doActivity(String activity) {
        if (activity.equals("eat")) {
            this.eat();
            return "The rabbit chew on the food bit by taking tiny bites.";
        }
        else if (activity.equals("nap")) {
            this.sleep();
            return "The rabbit took a long nap.";
        }
        else if (this.likesActivity(activity)) return ".... The rabbit really enjoyed the " + activity + " activity.";
        else if (this.dislikesActivity(activity)) return "The rabbit did not like " + activity + " activity. The rabbit quickly hopped away.";
        return "The rabbit felt indiferent about the " + activity + " activity.";
    }
}
