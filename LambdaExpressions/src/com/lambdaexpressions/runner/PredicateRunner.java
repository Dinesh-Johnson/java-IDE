package com.lambdaexpressions.runner;


import com.lambdaexpressions.interfaces.MyPredicate;

public class PredicateRunner {

    public static void main(String[] args) {

        MyPredicate predicate= (t)->t.length()>5;

        System.out.println(predicate.test("Hello"));


    }
}
