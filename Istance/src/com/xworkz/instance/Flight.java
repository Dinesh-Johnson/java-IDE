package com.xworkz.instance;

public class Flight {

    public int flightNumber;
    public String destination;
    public double duration;

    public Flight(int flightNumber){
        System.out.println("Flight Number :"+flightNumber);
        this.flightNumber=flightNumber;
    }
    public Flight(int flightNumber,String destination){
        System.out.println("Flight Number :"+flightNumber);
        System.out.println("Destination :"+destination);
        this.flightNumber=flightNumber;
        this.destination=destination;
    }
    public Flight(int flightNumber,String destination,double duration) {
        System.out.println("Flight Number :" + flightNumber);
        System.out.println("Destination :" + destination);
        System.out.println("Duration :" + duration + "hrs");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.duration = duration;
    }
}
