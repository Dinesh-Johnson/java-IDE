package com.lambdaexpressions.interfaces;

@FunctionalInterface
public interface MyLongBinaryOperator {

    long applyAsLong(long left, long right);
}
