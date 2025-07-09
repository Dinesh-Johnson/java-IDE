package com.xworkx.in.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Collections.sort(colors);

        System.out.println(colors);
    }
}
