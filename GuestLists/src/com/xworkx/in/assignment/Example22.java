package com.xworkx.in.assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class Example22 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers= new TreeSet<Integer>();
        numbers.add(14);
        numbers.add(50);
        numbers.add(541);
        numbers.add(12);
        numbers.add(98);
        numbers.add(85);
        System.out.println("Before removing: " + numbers);


        Iterator<Integer> integerIterator= numbers.iterator();
        while (integerIterator.hasNext()){
            int num = integerIterator.next();
            if (num < 50){
                integerIterator.remove();
            }
        }
        System.out.println("After removing elements smaller than 50: " + numbers);

    }
}
