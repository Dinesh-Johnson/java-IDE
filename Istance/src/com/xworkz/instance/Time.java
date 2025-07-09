package com.xworkz.instance;

public class Time {

    private int totalMinutes;

    public Time(int hours, int minutes) {
        this.totalMinutes = hours * 60 + minutes;
        System.out.println("Total Minutes: " + totalMinutes);
    }

    public Time(int totalMinutes) {
        this.totalMinutes = totalMinutes;
        System.out.println("Total Minutes: " + totalMinutes);
    }
}


