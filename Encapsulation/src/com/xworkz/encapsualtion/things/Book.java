package com.xworkz.encapsualtion.things;

public class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void bookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
