package com.xworkz.things.methods;

public class Library {
public final int libraryId;
public Book[] books;

    public Library(int id, Book[] books) {
        this.libraryId = id;
        this.books = books;
    }

    public void showBooks() {
         System.out.println("Library ID: " + libraryId);
        for (int i = 0; i < books.length; i++) {

             System.out.println(i);
        }
    }

    public static void main(String[] args) {

         Book[] books = { new Book("Java"), new Book("Python") };

        Library lib = new Library(1, books);
        lib.showBooks();
    }
}