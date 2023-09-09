package com.example.builder_sandwich;

public class FairyWorld {
    public Sandwich orderSandwich(SandwichMenu menu, SandwichSize size) {
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        switch (menu) {
            case CHICKEN_AND_BACON:
                FairyWorldSandwichDirector.chickenAndBacon(sandwichBuilder);
                break;
            case STEAK_AND_CHEESE:
                FairyWorldSandwichDirector.steakAndCheese(sandwichBuilder);
                break;
            case SPICY_ITALIAN:
                FairyWorldSandwichDirector.spicyItalian(sandwichBuilder);
                break;
            case TUNA_AND_EGG:
                FairyWorldSandwichDirector.tunaAndEgg(sandwichBuilder);
                break;
        }

        switch (size) {
            case FOOTLONG:
                sandwichBuilder.setSize(15.24);
                break;
            case HALF_FOOTLONG:
                sandwichBuilder.setSize(30.48);
                break;
        }

        return sandwichBuilder.build();
    }
}
