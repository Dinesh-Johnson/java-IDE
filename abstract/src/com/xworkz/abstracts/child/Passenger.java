package com.xworkz.abstracts.child;

public class Passenger {
    public String name;
    public String email;
    public int contactNumber;
    public int seatNumber;
    public String pickupLocation;
    public String dropLocation;

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", SeatNumber=" + seatNumber +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                '}';
    }
}
