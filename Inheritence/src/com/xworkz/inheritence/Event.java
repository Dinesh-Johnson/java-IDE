package com.xworkz.inheritence;

public class Event {

    public String occation;

    public Event(){

        System.out.println("Event deatails");
    }
    public Event(String name){
        System.out.println("Event name :"+name);
    }
    public Event(int date,int month,int year){
        System.out.println(date+"/"+month+"/"+year);
    }

    public void display(){
        System.out.println("Display method");
    }
}
