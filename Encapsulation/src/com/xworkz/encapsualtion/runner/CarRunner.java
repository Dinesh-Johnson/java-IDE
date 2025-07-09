package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car car=new Car();
        car.setBrand("Merceds BenZ");
        car.setSpeed(200);
        System.out.println("Car Name :"+car.getBrand());
        System.out.println("Speed :"+car.getSpeed()+" Kmph");
    }
}
