package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.MyConsumer;

public class ConsumerRunner {

    public static void main(String[] args) {
        MyConsumer c=(s)-> System.out.println(s.toUpperCase());

        c.accept("dinesh");
    }


}
