package com.xworkz.assoication.things;

public class Author {

    String name;
    Book[] book;
    int count;

    public Author(String name, Book[] book, int count) {
        this.name = name;
        this.book = book;
        this.count = count;
    }

    public void showBooks(){
        System.out.println("Author Name :"+name);
        System.out.println("Books written by "+name+" are :");
        for (int i = 0; i < count; i++) {
            System.out.println(" *"+book[i]);
        }
    }
}
