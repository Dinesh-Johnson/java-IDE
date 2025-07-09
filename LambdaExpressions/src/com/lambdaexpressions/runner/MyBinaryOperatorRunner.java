package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyBinaryOperator;

public class MyBinaryOperatorRunner {

    public static void main(String[] args) {
        MyBinaryOperator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));
    }
}
