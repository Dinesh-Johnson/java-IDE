package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyFunction;

public class FunctionRunner {
    public static void main(String[] args) {
        MyFunction getLength = (s) -> s.length();
        System.out.println("Length: " + getLength.apply("Hello"));
    }
}
