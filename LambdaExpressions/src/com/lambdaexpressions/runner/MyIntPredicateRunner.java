package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyIntPredicate;

public class MyIntPredicateRunner {
    public static void main(String[] args) {


        MyIntPredicate isEven = (n) -> n % 2 == 0;

        System.out.println("Is even? " + isEven.test(6));
    }
}
