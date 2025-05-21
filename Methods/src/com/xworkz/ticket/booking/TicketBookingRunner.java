package com.xworkz.ticket.booking;

public class TicketBookingRunner {

    public static void main(String[] args) {

        TicketBooking.bookTicket("Daneal Dinesh","Chennai");
        System.out.println();

        TicketBooking.bookTicket("Daneal Dinesh","Chennai",2);
        System.out.println();

        String[] names={"Dinesh","Vinodha","Aishwarya"};
        TicketBooking.bookTicket(names,"Chennai");
        System.out.println();

        TicketBooking.bookTicket("Daneal Dinesh","Bangalore",true);
        System.out.println();
    }
}
