package com.xworkz.dominos.product;

public class DominosRunner {

    public static void main(String[] args) {

        Dominos.orderPizza("Chicken Pizza",2);
        System.out.println();

        Dominos.applyCoupon(22546314);
        System.out.println();

        Dominos.cart(2);
        System.out.println();

        Dominos.city("Bangalore");
        System.out.println();

        Dominos.call(985622475);
        System.out.println();

        Dominos.address("BTM -1st Layout");
        System.out.println();

        Dominos.delivery("Cash on Delivery");
        System.out.println();

        Dominos.status(true);
        System.out.println();


    }
}
