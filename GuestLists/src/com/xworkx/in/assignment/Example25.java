package com.xworkx.in.assignment;

import java.util.LinkedList;

public class Example25 {

    public static void main(String[] args) {
        LinkedList<String> greetList = new LinkedList<String>();
        greetList.add("Hello");
        greetList.add("Bye");

        System.out.println("Contains Hello? " + greetList.contains("Hello"));
    }
}
