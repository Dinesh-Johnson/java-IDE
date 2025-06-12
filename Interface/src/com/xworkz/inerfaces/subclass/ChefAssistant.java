package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.RecipeService;
import com.xworkz.inerfaces.state.Recipes;

public class ChefAssistant implements RecipeService {

    Recipes[] recipes = new Recipes[5];
    int index=0;

    @Override
    public boolean addRecipe(Recipes recipe) {
        if (index<recipes.length){
            System.out.println("Stoarge Available");
            recipes[index]=recipe;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public void viewRecipe() {
        for (int i = 0; i < recipes.length; i++) {
            if (recipes[i]!=null){
                System.out.println("Recipe number "+(i+1)+" :"+recipes[i]);
            }
        }

    }

    @Override
    public void updateRecipe(int recipeNumber, Recipes newRecipe) {
        for (int i = 0; i < recipes.length; i++) {
            if (recipes[i].recipeNumber== recipeNumber){
                    recipes[i]=newRecipe;
                System.out.println("New Recipe Added :"+recipes[i]);
                return;
            }
        }

    }

    @Override
    public void deleteRecipe(String recipe) {
        for (int i = 0; i < index; i++) {
            if (recipes[i].recipe== recipe){
                    recipes[i]=null;
                System.out.println("Recipe is Deleted");
            }

        }
    }
}
