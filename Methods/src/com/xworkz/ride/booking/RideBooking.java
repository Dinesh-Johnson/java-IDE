package com.xworkz.ride.booking;

public class RideBooking {

    public static String bookRide(String pickup, String destination){
        System.out.println("Pickup :"+pickup);
        System.out.println("Destination :"+destination);
        return "";
    }
    public static String bookRide(String pickup, String destination, String carType){
        System.out.println("Pickup :"+pickup);
        System.out.println("Destination :"+destination);
        System.out.println("Car Type :"+carType);
        return "";
    }
    public static String bookRide(String pickup, String destination, int passengers){
        System.out.println("Pickup :"+pickup);
        System.out.println("Destination :"+destination);
        System.out.println("Number Of Passengers :"+passengers);
        return "";
    }
}
