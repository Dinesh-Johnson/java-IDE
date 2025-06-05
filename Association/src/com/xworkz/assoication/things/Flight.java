package com.xworkz.assoication.things;

public class Flight {
    String flightName;
    Passenger[] passengers = new Passenger[3];
    int passengerCount = 0;

    public Flight(String flightName) {
        this.flightName = flightName;
    }
    public void addPassenger(Passenger passenger){
        passengers[passengerCount]=passenger;
        passengerCount++;
    }
    public void showPassengers(){
        System.out.println(flightName+" Passengers are :");
        for (int i = 0; i < passengerCount; i++) {
            System.out.println(" :"+passengers[i].name);

        }
    }
}
