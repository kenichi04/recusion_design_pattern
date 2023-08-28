package com.example.design_pattern;

public class Mammal extends Animal{
    private double bodyTemperatureC;
    private double avgBodyTemperatureC;

    public Mammal(String species, double heightM, double weightKg, double lifeSpawnDays, String biologicalSex, double avgBodyTemperatureC) {
        super(species, heightM, weightKg, lifeSpawnDays, biologicalSex);
        this.avgBodyTemperatureC = avgBodyTemperatureC;
        this.bodyTemperatureC = this.avgBodyTemperatureC;
    }

    public void eat() {
        super.eat();
        System.out.println("this " + this.species + " is eating with its single lower jaw");
    }

    public void increaseBodyHeat(double celcius) {
        this.bodyTemperatureC += celcius;
    }

    public void decreaseBodyHeat(double celcius) {
        this.bodyTemperatureC -= celcius;
    }

    public void adjustBodyHeat() {
        this.bodyTemperatureC = this.avgBodyTemperatureC;
    }

    public String mammalInformation() {
        return "This is a mamml with a temperature of: " + this.bodyTemperatureC;
    }

    public String toString() {
        return super.toString() + " " + this.mammalInformation();
    }


}
