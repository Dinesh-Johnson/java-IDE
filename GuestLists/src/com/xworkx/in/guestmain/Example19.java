package com.xworkx.in.guestmain;

import java.util.ArrayList;

public class Example19 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

        for (int i = 0; i < planets.size(); i++) {
            System.out.println(i + " : " + planets.get(i));
        }
    }
}
