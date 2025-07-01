package com.xworkx.in.assignment;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 11; i <= 20; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
