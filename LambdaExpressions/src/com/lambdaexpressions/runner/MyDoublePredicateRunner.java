package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyDoublePredicate;

public class MyDoublePredicateRunner {
    public static void main(String[] args) {

        MyDoublePredicate isLessThan50 = (value) -> value < 50;
        System.out.println("Less than 50? " + isLessThan50.test(48.6));
    }
}
