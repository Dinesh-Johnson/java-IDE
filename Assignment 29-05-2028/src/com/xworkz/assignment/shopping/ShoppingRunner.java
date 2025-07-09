package com.xworkz.assignment.shopping;

public class ShoppingRunner {
    public static void main(String[] args) {

        ShoppingCartItem item = new ShoppingCartItem("Book", 5, 500.0);
        double totalPrice = item.gettotalPrice();
        System.out.println("Shopping Cart Item:");
        System.out.println("Item: " + item.name);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Unit Price: " + item.unitPrice);
        System.out.println("Total Price: " + totalPrice);
    }
}
