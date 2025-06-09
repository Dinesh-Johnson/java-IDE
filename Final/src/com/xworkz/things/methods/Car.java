package com.xworkz.things.methods;

public class Car {
public final Engine engine;

    public Car(Engine engine) {

         this.engine = engine;
    }

    public void showCar() {

        System.out.println("Car has " + engine);
    }

    public static void main(String[] args) {
        Engine e = new Engine("Petrol");
        Car c = new Car(e);
        c.showCar();
    }
}