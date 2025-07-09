package com.xworkz.event.creator;

public class EventCreator {

    public static String createEvent(String eventName){
        System.out.println("Event Name :"+eventName);
        return "";
    }
    public static String createEvent(String eventName, int expectedGuests){
        System.out.println("Event Name :"+eventName);
        System.out.println("Expected Guests :"+expectedGuests);
        return "";
    }
    public static String createEvent(String eventName, String location, String date){
        System.out.println("Event Name :"+eventName);
        System.out.println("Location :"+location);
        System.out.println("Date :"+date);
        return "";
    }
}
