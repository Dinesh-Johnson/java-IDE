package com.xworkx.in.assignment;

import java.util.LinkedList;

public class Example14 {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<String>();
        books.add("BookA");
        books.add("BookB");
        books.add("BookC");

        books.set(1, "Changed");

        System.out.println(books);
    }
}
