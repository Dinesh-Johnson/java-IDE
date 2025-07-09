package com.xworkz.things.methods;

public class FinalInLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

         final int value = i * 10;
             System.out.println("Final inside loop: " + value);
        }
    }
}