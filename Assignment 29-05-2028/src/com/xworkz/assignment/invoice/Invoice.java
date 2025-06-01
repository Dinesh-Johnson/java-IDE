package com.xworkz.assignment.invoice;

public class Invoice {
    //4. Invoice Generator Using Method Overloading
    //Problem Statement:
    //
    //You are building a simple Invoice Generator system for a store.
    // The system should calculate the total bill amount based on different input scenarios using method overloading.

    public double generateInvoice(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    public double generateInvoice(int quantity, double pricePerItem, double discount) {
        double totalPrice = quantity * pricePerItem;
        return totalPrice - (totalPrice * discount / 100);
    }

    public double generateInvoice(int quantity, double pricePerItem, double discount, double tax) {
        double discounted = generateInvoice(quantity,pricePerItem,discount);
        return discounted + (discounted * tax / 100);

    }
}

