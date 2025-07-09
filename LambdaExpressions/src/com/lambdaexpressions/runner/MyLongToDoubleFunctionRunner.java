package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongToDoubleFunction;

public class MyLongToDoubleFunctionRunner {

    public static void main(String[] args) {

        MyLongToDoubleFunction doubleFunction= (value )->value*value;

        System.out.println(doubleFunction.applyAsDouble(8976l));
    }
}
