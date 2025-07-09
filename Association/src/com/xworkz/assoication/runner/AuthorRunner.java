package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Author;
import com.xworkz.assoication.things.Book;

import java.util.Arrays;

public class AuthorRunner {
    public static void main(String[] args) {

        Book book1=new Book("A Game of Thrones (1996)",50);
        Book book2=new Book("A Clash of Kings (1998)",54);
        Book book3=new Book("Storm of Swords (2000)",40);
        Book book4=new Book("A Feast for Crows (2005)",30);

        Book[] books=new Book[4];
        books[0]=book1;
        books[1]=book2;
        books[2]=book3;
        books[3]=book4;

        Author author=new Author("George R.R Martin",books,4);

        author.showBooks();
        System.out.println(books.toString());
    }
}
