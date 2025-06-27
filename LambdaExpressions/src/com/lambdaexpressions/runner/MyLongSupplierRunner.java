package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongSupplier;

import java.util.Comparator;

public class MyLongSupplierRunner {

    public static void main(String[] args) {

        MyLongSupplier mobile = ()->9876554321L;
        System.out.println("Contact number is :"+mobile.getAsLong());


    }
}
