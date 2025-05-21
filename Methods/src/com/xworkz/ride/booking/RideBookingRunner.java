package com.xworkz.ride.booking;

public class RideBookingRunner {

    public static void main(String[] args) {

        RideBooking.bookRide("BTM Park","Silk Board Bus stop");
        System.out.println();

        RideBooking.bookRide("BTM Park","Silk Board Bus stop","Sedan");
        System.out.println();

        RideBooking.bookRide("BTM Park","Silk Board Bus stop",3);
        System.out.println();
    }
}
