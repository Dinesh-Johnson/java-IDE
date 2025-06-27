package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MySupplier;

public class MySuppilerRunner {

    public static void main(String[] args) {
        MySupplier getMessage = () -> "Java 8 is awesome!";
        System.out.println(getMessage.get());
    }
}
