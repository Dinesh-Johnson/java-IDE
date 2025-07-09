package com.xworkz.assoication.things;

public class Customer {
    String name;
    ShoppingCart cart;

    public Customer(String name, ShoppingCart cart) {
        this.name = name;
        this.cart = cart;
    }

    public void showDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Shopping Cart Details: " + cart);
    }
}
