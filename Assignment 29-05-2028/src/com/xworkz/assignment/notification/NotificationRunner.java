package com.xworkz.assignment.notification;

public class NotificationRunner {

    public static void main(String[] args) {

        NotificationSender notify = new NotificationSender();
        notify.sendNotification("Your order #123 has been placed");
        notify.sendNotification("Important update.", "dinesh.xworkz@gmail.com");
        notify.sendNotification("Imaginary GirlFriend", "987456321", true);

    }
}
