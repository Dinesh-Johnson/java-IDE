package com.xworkx.in.assignment;

import java.util.TreeSet;

public class GuestTreeSet {
    public static void main(String[] args) {

        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Dinesh");
        stringSet.add("Johnson");
        stringSet.add("Aishwarya");
        stringSet.add("Amulya");
        stringSet.add("Kiran");
        stringSet.add("Samuel");

        System.out.println(stringSet);
        System.out.println(stringSet.size());

        System.out.println("First: " + stringSet.first());
        System.out.println("Last: "+stringSet.last());

        System.out.println("Name after Dinesh is :"+stringSet.higher("Dinesh"));
        System.out.println(stringSet.isEmpty());

    }
}
