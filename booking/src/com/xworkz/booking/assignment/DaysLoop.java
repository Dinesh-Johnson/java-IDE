package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.DayNamesConstant;

public class DaysLoop {
    public static void main(String[] args) {

        DayNamesConstant[] days = DayNamesConstant.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
