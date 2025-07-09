package com.xworkz.polymophsim;

public class Events {

    public static void event(){

        System.out.println("Event Details");
    }
    public static void event(String name){

        System.out.println("The Event name is :"+name);
    }
    public static void event(String name,int date,int month){
        System.out.println(name+" is on :"+date+"-"+month);
    }
}
