package com.xworkz.assignment.shopping;

public class WaterTankRunner {
    public static void main(String[] args) {

        WaterTank tank = new WaterTank(100);
        tank.fill(50);
        System.out.println("Current Level: " + tank.getCurrentLevel());
        tank.empty(20);
        System.out.println("After emptying: " + tank.getCurrentLevel());
    }
}
