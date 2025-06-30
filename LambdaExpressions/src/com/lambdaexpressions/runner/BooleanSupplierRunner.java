package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.BooleanSupplier;

public class BooleanSupplierRunner {

    public static void main(String[] args) {

        BooleanSupplier isTrue= ()->true;

        System.out.println("The return value is :"+isTrue.getAsBoolean());
    }
}
