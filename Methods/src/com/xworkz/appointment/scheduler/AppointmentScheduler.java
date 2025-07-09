package com.xworkz.appointment.scheduler;

public class AppointmentScheduler {

    public static String bookAppointment(String patientName, String doctorName){
        System.out.println("Patient Name :"+patientName);
        System.out.println("Doctor Name :"+doctorName);
        return "";
    }
    public static String bookAppointment(String patientName, String doctorName, String date){
        System.out.println("Patient Name :"+patientName);
        System.out.println("Doctor Name :"+doctorName);
        System.out.println("Date of Appointment :"+date);
        return "";
    }
    public static String bookAppointment(String patientName, String doctorName, boolean isEmergency){
        if (isEmergency == true) {
            System.out.println("Patient Name :"+patientName);
            System.out.println("Doctor Name :"+doctorName);
        }
        return "";
    }

}
