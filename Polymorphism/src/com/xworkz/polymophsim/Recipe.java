package com.xworkz.polymophsim;

public class Recipe {

    public static void recipe(){
        System.out.println("The Recipe of Egg Fried rice");
    }
    public static void recipe(String mainIngredient){
        System.out.println("Main Ingrdient is :"+mainIngredient);
    }
    public static void recipe(String[] ingredients){
        System.out.println("Other Ingredients are :");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(i+1+"."+ingredients[i]);
        }
    }
}
