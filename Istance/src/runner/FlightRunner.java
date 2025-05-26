package runner;

import com.xworkz.instance.Flight;

public class FlightRunner {
    public static void main(String[] args) {

        Flight plane= new Flight(65123);
        System.out.println();

        Flight plane2= new Flight(65123,"Kyto,Japan");
        System.out.println();

        Flight plane3=new Flight(65123,"Kyoto,Japan",24.00);
        System.out.println();

    }
}
