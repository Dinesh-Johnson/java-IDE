package com.xworkz.assoication.things;

public class Passenger {
    String name;
    Flight[] flights=new Flight[3];
    int flightCount=0;

    public Passenger(String name) {
        this.name = name;
    }
    public void addFlight(Flight flight){
        flights[flightCount]=flight;
        flightCount++;
    }
    public void showFlights(){
        System.out.println("Flight of "+name+ " :");
        for (int i = 0; i < flightCount; i++) {
            System.out.println(" :"+flights[i].flightName);
        }
    }
}
