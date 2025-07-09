package com.xworkz.things.methods;

public class Book {
public String title;
    Publisher publisher; // used in Book → Publisher example

    public Book(String title) {

        this.title = title;
    }

    public Book(String title, Publisher pub) {
        this.title = title;
        this.publisher = pub;
    }

    public String toString() {
        if (publisher != null)
            return title + " by " + publisher;
        else
            return "Book: " + title;
    }

    public static void main(String[] args) {
        Publisher p = new Publisher("Pearson");
        Book b1 = new Book("Math", p);
        Book b2 = new Book("Science", p);

         System.out.println(b1);
         System.out.println(b2);
    }
}