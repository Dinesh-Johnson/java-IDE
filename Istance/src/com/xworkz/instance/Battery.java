package com.xworkz.instance;

public class Battery {

    public int percentage;

    public Battery(int percentage) {
        System.out.println("Battery: " + percentage + "%");
        this.percentage = percentage;
    }

    public Battery(boolean isCharging) {
        if (isCharging == true) {
            System.out.println("The Phone is Changing");
        }
    }
}

