package com.xworz.method;

public class Manager extends Employee{

    String n;
    int number;
    public void engineer(String n, int number) {
        this.number=number;
        this.n=n;
    }

    public void work() {
        System.out.println(name + " is Manager");
    }
}
