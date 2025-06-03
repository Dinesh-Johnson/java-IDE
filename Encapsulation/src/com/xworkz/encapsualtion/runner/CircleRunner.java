package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Circle;

public class CircleRunner {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0); // or use setRadius later
        double area = circle.calculateArea();

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + area);
    }
}
