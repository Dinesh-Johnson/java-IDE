package com.xworz.method;

public class Engineer extends Employee{
    //6. Create a class Employee with common fields like name and ID. Derive Engineer and Manager classes with their specific responsibilities.
    //Write a program to create both objects and call their specific methods using polymorphism.

    String n;
    int number;
    public void engineer(String n, int number) {
        this.number=number;
        this.n=n;
    }

    public void work() {
        System.out.println(name + " is Supervisor");
    }
}
