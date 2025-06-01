package com.xworkz.assignment.vehicle;

public class Car extends Vehicle{

    int passenger;

    public Car(String brand,int passenger){
        super(brand);
        this.passenger=passenger;
    }

    public void showDetails(){
        showBrand();
        System.out.println("Seats :"+passenger);
    }
}
