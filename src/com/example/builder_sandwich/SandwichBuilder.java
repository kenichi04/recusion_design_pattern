package com.example.builder_sandwich;

public class SandwichBuilder {
    private final static String DEFAULT_DOUGH = "Wheat";
    private final static String DEFAULT_TOPPING1 = "Ham";

    private String doughType;
    private String topping1;
    private String topping2;
    private String topping3;
    private String vegetable1;
    private String vegetable2;
    private String vegetable3;
    private String vegetable4;

    // いくつかのデフォルト
    private boolean cheese;
    private boolean ketchup;
    private boolean mustard;
    private boolean mayonnaise;
    private String sauce;

    public void SandwichBuilder() {
        this.reset();
    }

    public void addDoughType(String doughType) { this.doughType = doughType; }
    public void addTopping1(String topping) { this.topping1 = topping; }
    public void addTopping2(String topping) { this.topping2 = topping; }
    public void addTopping3(String topping) { this.topping3 = topping; }
    public void addVegetable1(String vegetable) { this.vegetable1 = vegetable; }
    public void addVegetable2(String vegetable) { this.vegetable2 = vegetable; }
    public void addVegetable3(String vegetable) { this.vegetable3 = vegetable; }
    public void addVegetable4(String vegetable) { this.vegetable4 = vegetable; }
    public void addCheese() { this.cheese = true; }
    public void noCheese() { this.cheese = false; }
    public void addKetchup() { this.ketchup = true; }
    public void noKetchup() { this.ketchup = false; }
    public void addMustard() { this.mustard = true; }
    public void noMustard() { this.mustard = false; }
    public void addMayo() { this.mayonnaise = true; }
    public void noMayo() { this.mayonnaise = false; }
    public void addSauce(String sauce) { this.sauce = sauce; }

    // build関数
    public Sandwich build() {
        Sandwich s = new Sandwich(
            this.doughType, this.topping1, this.topping2, this.topping3,
            this.vegetable1, this.vegetable2, this.vegetable3, this.vegetable4,
            this.cheese, this.ketchup, this.mustard, this.mayonnaise, this.sauce
        );
        this.reset();
        return s;
    }

    // reset関数
    public void reset() {
        this.doughType = SandwichBuilder.DEFAULT_DOUGH;
        this.topping1 = SandwichBuilder.DEFAULT_TOPPING1;
        this.topping2 = null;
        this.topping3 = null;
        this.vegetable1 = null;
        this.vegetable2 = null;
        this.vegetable3 = null;
        this.vegetable4 = null;

        this.cheese = false;
        this.ketchup = false;
        this.mustard = false;
        this.mayonnaise = false;
        this.sauce = null;
    }
}
