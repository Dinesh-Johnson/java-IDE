package com.xworkz.library.system;

public class LibrarySystemRunner {

    public static void main(String[] args) {

        LibrarySystem.issueBook("A song of Ice And Fire");
        System.out.println();

        LibrarySystem.issueBook("A song of Ice And Fire",7);
        System.out.println();

        LibrarySystem.issueBook("A song of Ice And Fire","Dinesh");
        System.out.println();

        String bookNames[]={"A Game of Thrones","A Clash of Kings","A Storm of Swords","A Feast for Crows","A song of Ice And Fire"};
        LibrarySystem.issueBook(bookNames);
        System.out.println();
    }
}
