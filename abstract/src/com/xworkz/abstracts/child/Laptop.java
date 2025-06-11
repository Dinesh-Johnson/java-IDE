package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Computer;

public class Laptop extends Computer {
    @Override
    public void runOS() {
        System.out.println("Laptop is running Windows 11");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }
}
