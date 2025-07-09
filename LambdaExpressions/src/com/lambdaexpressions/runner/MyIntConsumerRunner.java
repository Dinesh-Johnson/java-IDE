package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyIntConsumer;

public class MyIntConsumerRunner {

    public static void main(String[] args) {

        MyIntConsumer showDouble =(n)-> System.out.println("Double :"+(n*2));
        showDouble.accept(5);
    }
}
