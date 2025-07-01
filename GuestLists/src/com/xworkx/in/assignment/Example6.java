package com.xworkx.in.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {

        Set<Integer> values = new LinkedHashSet<Integer>();
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(10);
        values.add(20);

        System.out.println(values);
    }
}
