package com.xworkz.room.booking;

public class EoomBookingRunner {

    public static void main(String[] args) {

        RoomBooking.bookRoom("Ajith Kumar","Suite Room");
        System.out.println();

        RoomBooking.bookRoom("Ajth Kumar","Suite Room",3);
        System.out.println();

        RoomBooking.bookRoom("Ajith Kumar","Suite Room",true);
    }
}
