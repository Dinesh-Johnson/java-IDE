package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyIntSupplier;

public class MyIntSupplierRunner {

    public static void main(String[] args) {
        MyIntSupplier randomInt = () -> 42;
        System.out.println("Value: " + randomInt.get());
    }
}
