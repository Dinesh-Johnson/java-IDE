package com.xworkz.dominos.product;

import java.sql.SQLOutput;

public class Dominos {

    public static void order(){
        System.out.println("Welcome to Dominos");
    }
    public static void offer(){
        System.out.println("Today 25% offer");
    }
    public static void types(){
        System.out.println("Vegetarian or Non-Vegetarian");
    }
    public static void menu(){
        System.out.println("Dominos Menu");
    }
    public static void toppins(){
        System.out.println("Select Toppins");
    }
    public static void cheese(){
        System.out.println("Extra cheese or Less cheese");
    }
    public static void take(){
        System.out.println("Dinnine or Take Away");
    }
    public static void others(){
        System.out.println("Fries, Nuggets");
    }
    public static void drink(){
        System.out.println("Coca-cola,Pepsi,Miranda");
    }
    public static void online(){
        System.out.println("Order Accepted");
    }
    public static void orderPizza(String pizzaType,int quantity){
        System.out.println("Your order is --"+pizzaType+"--"+quantity);
    }
    public static void coupon(int couponID){
        System.out.println("Enter coupon ID="+couponID);
    }
    public static void cart(int cartItems){
        System.out.println("Cart Items- "+cartItems);
    }
    public static void city(String cityName){
        System.out.println("City Name :"+cityName);
    }
    public static void call(long contactDetails){
        System.out.println("Contact Details :"+contactDetails);
    }
    public static void address(String addressName){
        System.out.println("Address Name :"+addressName);
    }
    public static void orderType(String orderTypes){
        System.out.println("Order Typer :"+orderTypes);
    }
    public static void applyCoupon(int couponCode){
        System.out.println("Coupon Code :"+couponCode);
    }
    public static void delivery(String deliveryType){
        System.out.println("Delivery Type :"+deliveryType);
    }
    public static void status(boolean orderStatus){
        System.out.println("Order Status :"+orderStatus);
    }


}
