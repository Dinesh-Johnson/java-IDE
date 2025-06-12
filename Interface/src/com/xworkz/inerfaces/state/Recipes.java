package com.xworkz.inerfaces.state;

public class Recipes {

    public int recipeNumber;
    public String recipe;

    public Recipes(int recipeNumber, String recipe) {
        this.recipeNumber = recipeNumber;
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "recipeNumber=" + recipeNumber +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}
