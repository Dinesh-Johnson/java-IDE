package com.xworkz.appointment.scheduler;

public class AppointmentSchedulerRunner {

    public static void main(String[] args) {

        AppointmentScheduler.bookAppointment("Ramesh","Suresh");
        System.out.println();

        AppointmentScheduler.bookAppointment("Ramesh","Suresh","24/05/2025");
        System.out.println();

        AppointmentScheduler.bookAppointment("Ramesh","Suresh",true);

    }
}
