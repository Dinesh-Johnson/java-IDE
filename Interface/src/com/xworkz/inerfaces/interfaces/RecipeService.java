package com.xworkz.inerfaces.interfaces;

import com.xworkz.inerfaces.state.Recipes;

public interface RecipeService {



    public boolean addRecipe(Recipes recipe);
    public void viewRecipe();
    public void updateRecipe(int recipeNumber, Recipes newRecipe);
    public void deleteRecipe(String recipe);

}
