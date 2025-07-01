package com.xworkx.in.assignment;

import java.util.ArrayList;

public class Example10 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(2, 99);
        System.out.println(list);
    }
}
