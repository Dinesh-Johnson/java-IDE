package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.subclass.ChefAssistant;
import com.xworkz.inerfaces.state.Recipes;

public class RecipeRunner{
    public static void main(String[] args) {

        Recipes recipe1= new Recipes(1,"Briyani");
        Recipes recipe2= new Recipes(2,"Chicken Kebab");
        Recipes recipe3=new Recipes(3,"Fish Curry");

        ChefAssistant chefAssistant=new ChefAssistant();
        chefAssistant.addRecipe(recipe1);
        chefAssistant.addRecipe(recipe2);
        chefAssistant.addRecipe(recipe3);
        chefAssistant.viewRecipe();
        chefAssistant.deleteRecipe("Chicken Kebab");
        System.out.println("_______________");
        chefAssistant.viewRecipe();

    }
}
