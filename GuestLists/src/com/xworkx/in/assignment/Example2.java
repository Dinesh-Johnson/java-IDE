package com.xworkx.in.assignment;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Bangalore");
        animals.add("Chennai");
        animals.add("Mysore");
        animals.add("Coimbatore");
        animals.add("Hyderabad");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
