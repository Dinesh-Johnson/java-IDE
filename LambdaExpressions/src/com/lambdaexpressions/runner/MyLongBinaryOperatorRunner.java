package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongBinaryOperator;

public class MyLongBinaryOperatorRunner {

    public static void main(String[] args) {

        MyLongBinaryOperator mulitply = (left,right)->left*right;
        System.out.println(mulitply.applyAsLong(55584l,6655l));

    }
}
