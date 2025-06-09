package com.xworkz.things.methods;

public final class MathUtils {
    public final int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        MathUtils m = new MathUtils();
         System.out.println("Sum: " + m.add(10, 20));
    }
}