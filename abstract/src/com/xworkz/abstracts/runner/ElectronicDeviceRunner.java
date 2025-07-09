package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.Computer;
import com.xworkz.abstracts.abstrat.ElectronicDevice;
import com.xworkz.abstracts.child.Laptop;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {

        Computer computer= new Laptop();

        computer.turnOn();
        computer.runOS();
    }
}
