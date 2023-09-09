package com.example.builder_sandwich;

public class SandwichBuilder {
    private final static String DEFAULT_DOUGH = "Wheat";
    private final static String DEFAULT_TOPPING1 = "Ham";
    private final static double DEFAULT_SIZE_CM = 15.24;

    private String doughType;
    private double sizeCm;
    private String topping1;
    private String topping2;
    private String topping3;
    private String vegetable1;
    private String vegetable2;
    private String vegetable3;
    private String vegetable4;
    private String vegetable5;

    private boolean cheese;
    private boolean ketchup;
    private boolean mustard;
    private boolean mayonnaise;
    private String sauce;

    public void SandwichBuilder() {
        this.reset();
    }

    public SandwichBuilder addDoughType(String doughType) {
        this.doughType = doughType;
        return this;
    }

    public SandwichBuilder addTopping1(String topping) {
        this.topping1 = topping;
        return this;
    }

    public SandwichBuilder addTopping2(String topping) {
        this.topping2 = topping;
        return this;
    }

    public SandwichBuilder addTopping3(String topping) {
        this.topping3 = topping;
        return this;
    }

    public SandwichBuilder addVegetable1(String vegetable) {
        this.vegetable1 = vegetable;
        return this;
    }

    public SandwichBuilder addVegetable2(String vegetable) {
        this.vegetable2 = vegetable;
        return this;
    }

    public SandwichBuilder addVegetable3(String vegetable) {
        this.vegetable3 = vegetable;
        return this;
    }

    public SandwichBuilder addVegetable4(String vegetable) {
        this.vegetable4 = vegetable;
        return this;
    }

    public SandwichBuilder addVegetable5(String vegetable) {
        this.vegetable5 = vegetable;
        return this;
    }

    public SandwichBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public SandwichBuilder noCheese() {
        this.cheese = false;
        return this;
    }

    public SandwichBuilder addKetchup() {
        this.ketchup = true;
        return this;
    }

    public SandwichBuilder noKetchup() {
        this.ketchup = false;
        return this;
    }

    public SandwichBuilder addMustard() {
        this.mustard = true;
        return this;
    }

    public SandwichBuilder noMustard() {
        this.mustard = false;
        return this;
    }

    public SandwichBuilder addMayo() {
        this.mayonnaise = true;
        return this;
    }

    public SandwichBuilder noMayo() {
        this.mayonnaise = false;
        return this;
    }

    public SandwichBuilder addSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder setSize(double size) {
        this.sizeCm = size;
        return this;
    }

    // build関数
    public Sandwich build() {
        Sandwich s = new Sandwich(
            this.doughType, this.sizeCm, this.topping1, this.topping2, this.topping3,
            this.vegetable1, this.vegetable2, this.vegetable3, this.vegetable4, this.vegetable5,
            this.cheese, this.ketchup, this.mustard, this.mayonnaise, this.sauce
        );
        this.reset();
        return s;
    }

    // reset関数
    public SandwichBuilder reset() {
        this.doughType = SandwichBuilder.DEFAULT_DOUGH;
        this.sizeCm = SandwichBuilder.DEFAULT_SIZE_CM;
        this.topping1 = SandwichBuilder.DEFAULT_TOPPING1;
        this.topping2 = null;
        this.topping3 = null;
        this.vegetable1 = null;
        this.vegetable2 = null;
        this.vegetable3 = null;
        this.vegetable4 = null;
        this.vegetable5 = null;

        this.cheese = false;
        this.ketchup = false;
        this.mustard = false;
        this.mayonnaise = false;
        this.sauce = null;
        return this;
    }
}

enum SandwichMenu {
    CHICKEN_AND_BACON,
    STEAK_AND_CHEESE,
    SPICY_ITALIAN,
    TUNA_AND_EGG,
}

enum SandwichSize {
    FOOTLONG,
    HALF_FOOTLONG,
}
