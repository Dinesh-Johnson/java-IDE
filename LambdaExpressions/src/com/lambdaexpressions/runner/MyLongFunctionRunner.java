package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongFunction;

public class MyLongFunctionRunner {

    public static void main(String[] args) {

        MyLongFunction describe = (value) -> "Long number is: " + value;
        System.out.println(describe.apply(600000l));
    }
}
