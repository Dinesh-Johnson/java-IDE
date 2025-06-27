package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyIntFunction;

public class MyIntFunctionRunner {

    public static void main(String[] args) {

        MyIntFunction toLabel = (value) -> "Score: " + value;
        System.out.println(toLabel.apply(100));
    }
}
