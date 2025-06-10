package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.ColorConstant;

public class ColourCheck{
public static void main(String[] args) {
    String input = "GREEN";
    boolean found = false;

    ColorConstant[] colors = ColorConstant.values();

    for (int i = 0; i < colors.length; i++){
        String colorText = "" + colors[i];

        if (colorText == input) {
            found = true;
        }
    }

    if (found){
        System.out.println(input + " is a valid color.");
    }
    else{
        System.out.println(input + " is not a valid color.");
    }
    }
}
