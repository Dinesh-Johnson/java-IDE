package com.xworkz.inheritence;

public class Building {

    public String house;

    public Building(){

    }
    public Building(String address){
        System.out.println("Address"+address);

    }
    public Building(int area){
        System.out.println("Area"+area);

    }
    public Building(int length,int breadth){
        System.out.println("Lenght ="+length+" "+"Beadth ="+breadth);
    }
    public Building(char payment){
        System.out.println("Payement :"+payment);

    }
    public Building(Boolean payementStatus){
        if (payementStatus == true) {
            System.out.println("Payement Received");
        }
    }
    public Building(int contact,String name){
        System.out.println("Name :"+name);
        System.out.println("Contact Deatils :"+contact);
    }
    public Building(double cash){
        System.out.println("Payement Recieved of :"+cash);
    }
    public Building(String name,String location){
        System.out.println("Name :"+name+" "+"Loaction :"+location);
    }
    public void display(){
        System.out.println("This is "+house);
    }

}
