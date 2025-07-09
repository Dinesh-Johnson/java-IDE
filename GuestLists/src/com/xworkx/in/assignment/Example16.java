package com.xworkx.in.assignment;

import java.util.HashSet;

public class Example16 {
    public static void main(String[] args) {
        HashSet<String> basket = new HashSet<String>();
        basket.add("Banana");
        basket.add("Orange");

        System.out.println("Contains Banana: " + basket.contains("Banana"));
    }
}
