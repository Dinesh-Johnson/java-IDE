package com.xworkz.assignment.array;

public class Duplicate {
    public static void main(String[] args) {

        int[] arrays={4, 7, 2, 4, 9, 7, 1, 2};

        System.out.println("Duplicates Elements are");

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                if (arrays[i] == arrays[j]) {
                    System.out.println(arrays[i]);
                }
            }

        }
    }
}
