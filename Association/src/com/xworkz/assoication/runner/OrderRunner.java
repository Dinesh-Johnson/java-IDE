package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Item;
import com.xworkz.assoication.things.Order;

public class OrderRunner {
    public static void main(String[] args) {

        Order order=new Order("FA426");

        order.addItems(new Item("Laptop", 50000));
        order.addItems(new Item("Mouse", 500));
        order.addItems(new Item("Keyboard", 1500));

        order.showDetails();
        System.out.println();

    }
}
