package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyDoubleUnaryOperator;

public class MyDoubleUnaryOperatorRunner {

    public static void main(String[] args) {

        MyDoubleUnaryOperator price = (value) -> value * value * value;
        System.out.println("The Cuber of the 3 products Price is: " + price.apply(30.0));
    }
}
