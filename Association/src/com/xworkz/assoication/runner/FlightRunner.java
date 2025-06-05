package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Flight;
import com.xworkz.assoication.things.Passenger;

public class FlightRunner {
    public static void main(String[] args) {

        Flight flight1=new Flight("American Airlines Flight 11");
        Flight flight2=new Flight("United Airlines Flight 175");

        Passenger passenger1=new Passenger("Mohamed");
        Passenger passenger2=new Passenger("Abdulaziz");
        Passenger passenger3=new Passenger("Majed");

        flight1.addPassenger(passenger1);
        flight2.addPassenger(passenger2);

        flight2.addPassenger(passenger3);
        passenger3.addFlight(flight1);
        passenger2.addFlight(flight2);
        passenger2.addFlight(flight1);

        System.out.println();

        passenger1.showFlights();
        System.out.println();
        passenger2.showFlights();
        System.out.println();
        passenger3.showFlights();
    }
}
