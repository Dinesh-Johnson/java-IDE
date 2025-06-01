package com.xworkz.assignment.rental;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Car("MG Hector", "KA12K3456");

        System.out.println("Available: " + car.isAvailable());
        car.rentCar();
        System.out.println();

        System.out.println("Available after renting: " + car.isAvailable());
        car.returnCar();
        System.out.println();

        System.out.println("Available after return: " + car.isAvailable());
    }
}
