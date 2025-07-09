package com.xworkz.assignment.vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Car car= new Car("MG",5);
        Motorcycle bike=new Motorcycle("Honda",true);

        car.showDetails();
        System.out.println();
        bike.showDetails();
    }
}
