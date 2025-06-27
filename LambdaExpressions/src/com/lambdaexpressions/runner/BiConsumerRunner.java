package com.lambdaexpressions.runner;

import com.lambdaexpressions.interfaces.BiConsumer;

public class BiConsumerRunner {

    public static void main(String[] args) {

        BiConsumer show = (name, age) -> System.out.println(name + " is " + age + " years old");
        show.accept("Dinesh",28);
    }
}
