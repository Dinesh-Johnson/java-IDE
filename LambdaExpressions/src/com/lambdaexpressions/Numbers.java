package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Numbers {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(50);
        numbers.add(68);
        numbers.add(54);
        numbers.add(96);
        numbers.add(45);
        numbers.add(28);
        numbers.add(30);
        numbers.add(49);
        numbers.add(2);

        for (Integer i :numbers) {

            if (i > 50) {
                System.out.println("The Number is > 50 :"+i);

            }
        }
        System.out.println("========================================");
        Collection<Integer> collection= new ArrayList<>(numbers);

        for(Integer number : collection){
            if (number>50){
                System.out.println("The Number is > 50 :"+number);

            }
        }
    }
}
