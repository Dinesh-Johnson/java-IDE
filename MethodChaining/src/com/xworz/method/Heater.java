package com.xworz.method;

public class Heater extends Appliance{
    //8. You are creating a home automation system.
    // There's a class Appliance,
    // and classes Fan, AC, and Heater inherit from it.
    // Only AC and Heater override the method adjustTemperature().
    //Write a main method that takes the appliance type as input and triggers the correct behavior without if-else.

    public void adjustTemperature(){
        System.out.println("Adjusting Heater Temperature");

    }
}
