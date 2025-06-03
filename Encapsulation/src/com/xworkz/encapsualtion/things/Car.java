package com.xworkz.encapsualtion.things;

public class Car {
    private String brand;
    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return speed;
    }
    public String getBrand() {
        return brand;
    }
}
