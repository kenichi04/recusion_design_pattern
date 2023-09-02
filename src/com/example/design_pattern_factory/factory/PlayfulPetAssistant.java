package com.example.design_pattern_factory.factory;

import com.example.design_pattern_factory.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

// has factory method - createPlayfulPeT()
public abstract class PlayfulPetAssistant {
    protected static final double DEFAULT_RENT_TIME = 1.0;
    protected static final String DEFAULT_TOUR = "all-rounder pack";

    protected Person currentPerson;
    protected double currentRentTime = PlayfulPetAssistant.DEFAULT_RENT_TIME;
    protected static String[] availableActivities = {"eat", "walk", "drink", "nap", "pet", "run", "explore"};
    protected static String[] availableTours = {"all-rounder pack", "deluxe rounder pack"};

    public String[] getActivities() {
        return this.availableActivities;
    }

    public String[] getAvailableTours() {
        return this.availableTours;
    }

    public boolean isValidTour(String tour) {
        return Arrays.asList(this.getAvailableTours()).contains(tour);
    }

    protected String getRandomActivity() {
        List<String> activities = Arrays.asList(this.getActivities());
        int ran = new Random().nextInt(activities.size());
        return activities.get(ran);
    }

    public void setPerson(Person person) {
        this.currentPerson = person;
    }

    public void setHours(double hours) {
        this.currentRentTime = hours;
    }

    public double getCurrentRentTime() {
        return this.currentRentTime;
    }

    public void reset() {
        this.currentPerson = null;
        this.currentRentTime = this.DEFAULT_RENT_TIME;
    }

    // ペットレンタル時のpersonのサポートに関する全体のアルゴリズム実行
    public double runAssistanceTour(Person person) {
        final int amount = 1;
        final String tour = this.DEFAULT_TOUR;
        return this.runAssistanceTour(person, tour, amount);
    }

    public double runAssistanceTour(Person person, String tour, int amount) {
        if (!this.isValidTour(tour)) System.out.println("The tour guide does not accept the " + tour + "tour.");
        // use factory method
        List<PlayfulPet> pets = this.createPlayfulPets(amount);
        double rentalCosts = 0;

        System.out.println("");
        System.out.println("Booting up... Playful Pet Assistance robot at your service.");
        System.out.println("Printing information about the Person to service..." + person);
        System.out.println("");

        for (PlayfulPet playfulPet : pets) {
            System.out.println("Printing information about the Playful pet - " + playfulPet.getPetName() + " to service..." + playfulPet);

            if (tour.equals("all-rounder pack") || tour.equals("deluxe rounder pack")) {
                int count = tour.equals("all-rounder pack") ? 1 : 3;
                this.genericRounderTour(count, person, playfulPet);
            }
            // tour 追加可
            else {
                System.out.println("The tour assistant robot for " + playfulPet.getPetName() + " and " + person.getName() + " did nothing.");
            }
            rentalCosts += playfulPet.getRentalCosts() * this.getCurrentRentTime();
        }
        this.reset();

        return rentalCosts;
    }

    private void genericRounderTour(int activityCount, Person person, PlayfulPet pet) {
        String newLine = System.lineSeparator();
        System.out.println(newLine + "Now starting the generic rounder tour with " + activityCount + " activity(s)");
        System.out.println(person.getName() + " greets " + pet.getPetName() + newLine);
        System.out.println(pet.play() + newLine);
        System.out.println(pet.playNoise() + newLine);
        System.out.println(pet.playWithPerson(person) + newLine);
        for (int i = 0; i < activityCount; i++) {
            String activity = this.getRandomActivity();
            System.out.println(pet.getPetName() + " will now " + activity);
            System.out.println("--------");
            System.out.println(pet.doActivity(activity));
            System.out.println("--------" + newLine);
        }
    }

    // Factory Method
    public abstract PlayfulPet createPlayfulPet();

    public abstract List<PlayfulPet> createPlayfulPets(int amount);
}
