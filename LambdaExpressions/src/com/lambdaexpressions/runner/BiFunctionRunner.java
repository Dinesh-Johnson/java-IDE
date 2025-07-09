package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.BiFunction;

public class BiFunctionRunner {

    public static void main(String[] args) {

        BiFunction add=(a,b)->a+b;

        System.out.println("Sum: " + add.apply(10, 20));
    }
}
