package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyDoubleConsumer;

public class MyDoubleConsumerRunner {

    public static void main(String[] args) {

        double pi= 3.14;

        MyDoubleConsumer squareArea = (radius)-> System.out.println("The square of the "+radius+" is"+(radius*radius*pi));
        squareArea.accept(20);
    }
}
