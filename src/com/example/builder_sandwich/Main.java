package com.example.builder_sandwich;

public class Main {
    public static void main(String[] args) {
        // builderを通してsandwich作成
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        sandwichBuilder.addDoughType("Italian");
        sandwichBuilder.addTopping1("Chicken");
        sandwichBuilder.addTopping2("Bacon");
        sandwichBuilder.addSauce("Ranch");
        sandwichBuilder.addVegetable1("Lettuce");
        sandwichBuilder.addVegetable2("Red Onions");
        sandwichBuilder.addVegetable3("Tomato");
        sandwichBuilder.addCheese();

        Sandwich chickenAndBacon = sandwichBuilder.build();
        System.out.println(chickenAndBacon);
    }
}
