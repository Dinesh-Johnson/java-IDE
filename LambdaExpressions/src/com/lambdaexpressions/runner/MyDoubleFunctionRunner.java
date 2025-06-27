package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyDoubleFunction;

public class MyDoubleFunctionRunner {

    public static void main(String[] args) {

        MyDoubleFunction label = (value) -> "Value = " + value;
        System.out.println(label.apply(16.77));
    }

}
