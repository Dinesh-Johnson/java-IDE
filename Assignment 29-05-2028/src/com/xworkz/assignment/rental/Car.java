package com.xworkz.assignment.rental;

public class Car {
    String modelName;
    String registrationNumber;
    boolean rented;

    public Car(String modelName, String registrationNumber) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.rented = false;
    }

    public void rentCar() {
        rented = true;
        System.out.println(modelName + " (" + registrationNumber + ") has been rented.");
    }

    public void returnCar() {
        rented = false;
        System.out.println(modelName + " (" + registrationNumber + ") has been rented.");
    }

    public boolean isAvailable() {
        return !rented;
    }

}
