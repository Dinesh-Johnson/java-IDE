package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Customer;
import com.xworkz.assoication.things.ShoppingCart;

public class ShoppingCartRunner {
    public static void main(String[] args) {

        ShoppingCart shoppingCart=new ShoppingCart(3,1100);
        Customer customer=new Customer("Dinesh",shoppingCart);

        customer.showDetails();
    }
}
