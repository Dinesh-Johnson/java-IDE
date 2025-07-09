package com.xworkz.ticket.booking;

public class TicketBooking {

    public static String bookTicket(String passengerName,String destination){
        System.out.println("Passenger Name :"+passengerName);
        System.out.println("Destintion :"+destination);
        return "one way";
    }
    public static String bookTicket(String passengerName, String destination, int numberOfTickets){
        System.out.println("Passenger Name :"+passengerName+"  No. of Tickets :"+numberOfTickets);
        return "";
    }
    public static String bookTicket(String[] passengerNames, String destination){
        for (int i = 0; i < passengerNames.length; i++) {
            System.out.println("Passenger Name :"+passengerNames[i]);
            System.out.println("Destination :"+destination);
            System.out.println();
        }
        return "";
    }
    public static String bookTicket(String passengerName, String destination, boolean isReturn){
        if (isReturn == true) {
            System.out.println("Passenger Name :"+passengerName);
            System.out.println("Destination :"+destination);
        }
        return "";
    }
}
