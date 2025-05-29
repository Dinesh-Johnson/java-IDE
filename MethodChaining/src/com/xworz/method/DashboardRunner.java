package com.xworz.method;

public class DashboardRunner {
    public static void main(String[] args) {

        BikeDashboard d=new BikeDashboard();
        d.fuel=100;
        d.speed=80;
        d.helmet();
        System.out.println();

        CarDashboard c=new CarDashboard();
        c.airBags();


    }
}
