package com.xworkz.assignment.array;

public class Arraydelete {
    public static void main(String[] args) {

        int[] arrays={10,18,24,37,55,66};
        int position = 4;
        int size = arrays.length;

        for (int i = position; i < size-1 ; i++) {
            arrays[i]=arrays[i+1];
            
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
