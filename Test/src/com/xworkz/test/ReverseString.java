package com.xworkz.test;

public class ReverseString {
    public static void main(String[] args) {

        String[] array={"Moniter","GPU","Mouse","Keyboard"};
        for (int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        String []trace=array;
    }
}


