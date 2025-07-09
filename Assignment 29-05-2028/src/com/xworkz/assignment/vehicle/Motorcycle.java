package com.xworkz.assignment.vehicle;

public class Motorcycle extends Vehicle{

    boolean helmetStatus;

    public Motorcycle(String brand,boolean helmetStatus){
        super(brand);
        this.helmetStatus=helmetStatus;
    }
    public void showDetails(){
        showBrand();
        if(helmetStatus == true){
            System.out.println("Helmet Status is good");
        }
    }

}
