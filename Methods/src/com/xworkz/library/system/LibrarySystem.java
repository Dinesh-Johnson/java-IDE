package com.xworkz.library.system;

public class LibrarySystem {

    public static String issueBook(String bookTitle){
        System.out.println("Book Title :"+bookTitle);
        return "";
    }
    public static String issueBook(String bookTitle, int days){
        System.out.println("Book Title :"+bookTitle);
        System.out.println("Due Date :"+days);
        return "";
    }
    public static String issueBook(String bookTitle, String studentName){
        System.out.println("Book Title :"+bookTitle);
        System.out.println("Student Name :"+studentName);
        return "";
    }
    public static String issueBook(String[] bookTitles){
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println("Book Title :"+bookTitles[i]);
        }
        return "";
    }
}
