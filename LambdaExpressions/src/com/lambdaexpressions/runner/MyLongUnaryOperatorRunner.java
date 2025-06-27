package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongUnaryOperator;

public class MyLongUnaryOperatorRunner {

    public static void main(String[] args) {

        MyLongUnaryOperator square = (value) -> value * value;

        System.out.println("Square: " + square.apply(12l));
    }
}
