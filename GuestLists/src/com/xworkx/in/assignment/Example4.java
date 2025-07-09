package com.xworkx.in.assignment;

import java.util.HashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {

        Set<String> fruitSet = new HashSet<String>();
        fruitSet.add("Apple");
        fruitSet.add("Kiwi");
        fruitSet.add("Peach");
        fruitSet.add("Apple");
        fruitSet.add("Plum");

        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}
