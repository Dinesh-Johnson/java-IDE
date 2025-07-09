package com.xworkx.in.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Example21 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(25);
        ages.add(35);
        ages.add(29);

        int maxAge = Collections.max(ages);
        System.out.println("Max age: " + maxAge);
    }
}
