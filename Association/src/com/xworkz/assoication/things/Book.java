package com.xworkz.assoication.things;

public class Book {

    String bookName;
    int price;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price= $" + price +
                '}';
    }
}
