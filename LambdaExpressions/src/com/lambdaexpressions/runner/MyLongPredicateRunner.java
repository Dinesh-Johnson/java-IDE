package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongPredicate;

public class MyLongPredicateRunner {

    public static void main(String[] args) {

        MyLongPredicate number = (value)->value==value;

        System.out.println("is the value is equal? "+number.test(987654321l));
    }
}
