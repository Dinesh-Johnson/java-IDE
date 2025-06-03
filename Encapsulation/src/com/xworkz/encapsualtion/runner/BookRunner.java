package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Book;

public class BookRunner {
    public static void main(String[] args) {

        Book book=new Book();
        book.setTitle("Game of Thrones");
        book.setAuthor("George RR Martin");
        book.bookInfo();
    }
}
