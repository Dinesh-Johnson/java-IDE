package com.xworkz.room.booking;

public class RoomBooking {

    public static String bookRoom(String guestName, String roomType){
        System.out.println("Guest Name :"+guestName);
        System.out.println("Room Type : "+roomType);
        return "";
    }
    public static String bookRoom(String guestName, String roomType, int numberOfNights){
        System.out.println("Guest Name :"+guestName);
        System.out.println("Room Type : "+roomType);
        System.out.println("Number of Nighta :"+numberOfNights);
        return "";
    }
    public static String bookRoom(String guestName, String roomType, boolean includesBreakfast){
        if (includesBreakfast == true) {
            System.out.println("Guest Name :"+guestName);
            System.out.println("Room Type : "+roomType);
            System.out.println("Breakfast Incuded");
        }
        else {
            System.out.println("Guest Name :"+guestName);
            System.out.println("Room Type : "+roomType);
            System.out.println("Breakfast not Incuded");
        }
        return "";
    }
}
