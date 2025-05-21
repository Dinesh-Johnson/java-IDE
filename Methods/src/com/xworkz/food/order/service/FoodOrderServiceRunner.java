package com.xworkz.food.order.service;

public class FoodOrderServiceRunner {

    public static void main(String[] args) {

        FoodOrderService.placeOrder("Pizza");
        System.out.println();

        FoodOrderService.placeOrder("pizza",2);
        System.out.println();

        FoodOrderService.placeOrder("Pizza",true);
        System.out.println();

        String[] items={"Pizza","Fries","Nuggets","Soft Drinks"};
        FoodOrderService.placeOrder(items);
        System.out.println();
    }
}
