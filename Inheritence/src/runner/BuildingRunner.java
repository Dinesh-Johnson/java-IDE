package runner;

import com.xworkz.inheritence.Building;

public class BuildingRunner {

    public static void main(String[] args) {

        new Building();
        System.out.println();

        new Building("Bangalore");
        System.out.println();

        new Building(2400);
        System.out.println();

        new Building(600,400);
        System.out.println();

        new Building('C');
        System.out.println();

        Building b = new Building();
        b.house="Our House";
        b.display();
    }
}
