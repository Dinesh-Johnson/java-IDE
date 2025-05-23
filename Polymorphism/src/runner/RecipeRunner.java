package runner;

import com.xworkz.polymophsim.Recipe;

public class RecipeRunner {

    public static void main(String[] args) {

        Recipe.recipe();
        System.out.println();

        Recipe.recipe("Eggs");
        System.out.println();

        String need[]={"Rice","Pepper","Salt","Onion","Garlic"};
        Recipe.recipe(need);
    }
}
