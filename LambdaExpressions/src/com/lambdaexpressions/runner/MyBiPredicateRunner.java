package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyBiPredicate;

public class MyBiPredicateRunner {
    public static void main(String[] args) {

        MyBiPredicate isSame = (s1, s2) -> s1 == s2;
        System.out.println("is it Same? " + isSame.test("Java", "Java"));
    }
}
