package com.xworz.method;

public class Dashboard {
    //5. Create a base class Dashboard that contains the vehicle's speed and fuel info. Derive CarDashboard and BikeDashboard,
    // each with methods for showing additional features (e.g., airbag status for car, helmet alert for bike).
    //Write a program to display both dashboards

    int speed;
    int fuel;
    public void vehicle(int speed,int fuel){
        this.speed=speed;
        this.fuel=fuel;
    }
}
