package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyDoubleSupplier;

public class MyDoubleSupplierRunner {

    public static void main(String[] args) {


        MyDoubleSupplier getPI= () -> 3.141;
        System.out.println("PI: " + getPI.value());
    }
}
