package com.xworkz.order.processor;

public class OrderProcessorRunner {

    public static void main(String[] args) {

        OrderProcessor.processOrder("AX7B9K2P");
        System.out.println();

        OrderProcessor.processOrder("AX7B9K2P",5);
        System.out.println();

        String[] items={"Coffee Mug","Cup","Kettle"};
        OrderProcessor.processOrder(items);
        System.out.println();

        OrderProcessor.processOrder("AX7B9K2P","LJF51DKR");
        System.out.println();
    }
}
