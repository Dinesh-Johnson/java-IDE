package com.xworkx.in.guestmain;


import java.util.TreeSet;

public class Example18 {
    public static void main(String[] args) {
        TreeSet<Integer> levels = new TreeSet<Integer>();
        levels.add(5);
        levels.add(25);
        levels.add(15);

        System.out.println("Min: " + levels.first());
        System.out.println("Max: " + levels.last());
    }
}
