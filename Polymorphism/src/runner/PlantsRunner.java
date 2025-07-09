package runner;

import com.xworkz.polymophsim.Plants;

public class PlantsRunner {

    public static void main(String[] args) {

        Plants.plant();
        System.out.println();

        Plants.plant("Hibiscus");
        System.out.println();

        Plants.plant("Rose",1);
    }
}
