package com.xworkz.assignment.notification;

public class NotificationSender {

    //6.Notification Sender
    //Context: Web apps, mobile apps, system alerts
    //Description:
    //Create a class NotificationSender and overload sendNotification() to handle:
    //sendNotification(String message) ? General notification
    //sendNotification(String message, String email) ? Email
    //sendNotification(String message, String phoneNumber, boolean isWhatsApp) ? SMS or WhatsApp

    public void sendNotification(String message){
        System.out.println("Notification: " + message);
    }
    public void sendNotification(String message, String email){
        System.out.println("New Message/Mail " + email + ": " + message);
    }
    public void sendNotification(String message, String phoneNumber, boolean isWhatsApp){
        if (isWhatsApp) {
            System.out.println("WhatsApp to " + phoneNumber + ": " + message);
        } else {
            System.out.println("SMS to " + phoneNumber + ": " + message);
        }
    }
}
