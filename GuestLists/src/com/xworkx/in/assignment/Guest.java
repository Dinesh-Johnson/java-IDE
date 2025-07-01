package com.xworkx.in.assignment;

import java.util.HashSet;
import java.util.Set;

public class Guest {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Dinesh");
        stringSet.add("Johnson");
        stringSet.add("Aishwarya");
        stringSet.add("Amulya");
        stringSet.add("Kiran");
        stringSet.add("Samuel");

        System.out.println(stringSet);

        if (stringSet.contains("Dinesh")){
            System.out.println("It contains");
        }
        System.out.println("The size of Set is :"+stringSet.size());
        if (stringSet.remove("Kiran")) {
            System.out.println("Removed");
        }
        System.out.println("After Removing Kiran"+ stringSet);
        System.out.println(stringSet);
        System.out.println("The Array length of the Set is :"+stringSet.toArray().length);
        System.out.println(stringSet);

        System.out.println("The Hash Value is :"+stringSet.hashCode());


        stringSet.clear();
        System.out.println(stringSet.size());
    }
}
