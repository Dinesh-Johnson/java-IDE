package com.xworkz.assignment.array;

public class Array {
    //11.Write a program to insert an element in a specific position in an array.
    public static void main(String[] args) {

        int[] arrays={10,18,24,37,49,66};
        int insert = 55;
        int position = 5;
        int[] newArray= new int[arrays.length+1];

        for (int i = 0,j=0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i]=insert;
            }
            else {
                newArray[i]=arrays[j];
                j++;
            }

        }
        System.out.print("Array after insertion: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
