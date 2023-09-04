package com.example.builder_sandwich;

public class Main {
    public static void main(String[] args) {
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        sandwichBuilder.addDoughType("Italian").addTopping1("Chicken")
                .addTopping2("Bacon").addSauce("Ranch")
                .addVegetable1("Lettuce").addVegetable2("Red Onions")
                .addVegetable3("Tomato").addCheese();

        Sandwich chickenAndBacon = sandwichBuilder.build();
        System.out.println(chickenAndBacon);
    }
}
