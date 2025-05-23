package com.xworkz.room.booking;

public class RoomBookingRunner {

    public static void main(String[] args) {

        RoomBooking.bookRoom("Ajith Kumar","Suite Room");
        System.out.println();

        RoomBooking.bookRoom("Ajth Kumar","Suite Room",3);
        System.out.println();

        RoomBooking.bookRoom("Ajith Kumar","Suite Room",true);
    }
}
