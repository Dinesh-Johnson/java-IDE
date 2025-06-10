package com.xworkz.booking.assignment;


import com.xworkz.booking.constants.OrderStatus;

public class OrderRunner {
    public static boolean isFinalStatus(OrderStatus status) {
        return status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED;
    }

    public static void main(String[] args) {
        System.out.println("DELIVERED is final: " + isFinalStatus(OrderStatus.DELIVERED));
        System.out.println("PLACED is final: " + isFinalStatus(OrderStatus.PLACED));
    }
}
