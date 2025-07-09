package com.lambdaexpressions.runner;

import java.util.function.Consumer;

public class MyConsumerRunner {

    public static void main(String[] args) {

        Consumer consumer =(t)-> System.out.println(t);
        consumer.accept("Hello");
    }
}
