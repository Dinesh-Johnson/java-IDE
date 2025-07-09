package com.xworkz.encapsualtion.things;

public class Circle {
    private double radius;
    private static final double PI = 3.14; // simple PI value

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return PI * radius * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
