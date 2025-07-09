package com.xworkz.food.order.service;

public class FoodOrderService {

    public static String placeOrder(String itemName){
        System.out.println("Item Name :"+itemName);
        return "";
    }
    public static String placeOrder(String itemName, int quantity){
        System.out.println("Item Name :"+itemName+"  Quantity :"+quantity);
        return "";
    }
    public static String placeOrder(String itemName, boolean isTakeaway){
        if (isTakeaway == true) {
            System.out.println("Item Name :"+itemName);
        }
        return "";
    }
    public static String placeOrder(String[] itemNames){
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println("Item Name :"+itemNames[i]);
        }
        return "";
    }

}
