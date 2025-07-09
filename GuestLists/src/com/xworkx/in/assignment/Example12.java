package com.xworkx.in.assignment;

import java.util.HashSet;

public class Example12 {
    public static void main(String[] args) {
        HashSet<Integer> digits = new HashSet<Integer>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);

        digits.remove(4);

        System.out.println(digits);
    }
}
