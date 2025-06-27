package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyUnaryOperator;

public class MyUnaryOperatorRunner {

    public static void main(String[] args) {

        MyUnaryOperator square = (n) -> n * n;
        System.out.println("Square: " + square.apply(5));
    }
}
