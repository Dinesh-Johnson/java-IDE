package com.xworkz.order.processor;

public class OrderProcessor {

    public static String processOrder(String itemId){
        System.out.println("Order ID :"+itemId);
        return "";
    }
    public static String processOrder(String itemId, int quantity){
        System.out.println("Order ID :"+itemId+"  Quantity :"+quantity);
        return "";
    }
    public static String processOrder(String[] itemIds){
        for (int i = 0; i < itemIds.length; i++) {
            System.out.println("Order Item :"+itemIds[i]);
        }
        return "";
    }
    public static String processOrder(String itemId, String couponCode){
        System.out.println("Order ID :"+itemId);
        System.out.println("Coupon ID :"+couponCode);
        return "";
    }
}
