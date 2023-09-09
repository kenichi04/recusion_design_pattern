package com.example.builder_sandwich;

public class Main {
    public static void main(String[] args) {
        FairyWorld fairyWorld = new FairyWorld();
        Sandwich chickenAndBacon = fairyWorld.orderSandwich(
                SandwichMenu.CHICKEN_AND_BACON, SandwichSize.FOOTLONG);
        Sandwich steakAndCheese = fairyWorld.orderSandwich(
                SandwichMenu.STEAK_AND_CHEESE, SandwichSize.FOOTLONG);
        Sandwich spicyItalian = fairyWorld.orderSandwich(
                SandwichMenu.SPICY_ITALIAN, SandwichSize.HALF_FOOTLONG);
        Sandwich tunaAndEgg = fairyWorld.orderSandwich(
                SandwichMenu.TUNA_AND_EGG, SandwichSize.FOOTLONG);

        String endl = System.lineSeparator();
        System.out.println(chickenAndBacon + endl);
        System.out.println(steakAndCheese + endl);
        System.out.println(spicyItalian + endl);
        System.out.println(tunaAndEgg + endl);
    }
}
