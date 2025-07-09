package com.xworkz.assignment.vehicle;

public class Vehicle {
    //3. Hierarchical Inheritance
    //Write a program to demonstrate hierarchical inheritance using a base class Vehicle, and two subclasses Car and Motorcycle.
    // Add appropriate methods and attributes for each.

    String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }

    public void showBrand(){
        System.out.println("Brand Name :"+brand);
    }
}
