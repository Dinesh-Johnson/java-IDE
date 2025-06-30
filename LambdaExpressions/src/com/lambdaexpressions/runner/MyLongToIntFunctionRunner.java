package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongToIntFunction;

import java.util.function.ObjDoubleConsumer;

public class MyLongToIntFunctionRunner {

    public static void main(String[] args) {

        MyLongToIntFunction cuboidArea =(value)-> Math.toIntExact(value * value * value);

        System.out.println(cuboidArea.applyAsInt(5)+" Cubic metre");
    }
}
