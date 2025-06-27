package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyLongConsumer;

public class MyLongConsumerRunner {

    public static void main(String[] args) {

        MyLongConsumer mobile = (value )-> System.out.println(value+value);


    }
}
