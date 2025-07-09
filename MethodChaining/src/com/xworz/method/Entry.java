package com.xworz.method;

public class Entry {

    //2. Create a base class Entry that stores a date and a title. Derive a class MoodEntry that stores the user's mood level (1 to 10).
    //Write a program that allows the user to create a mood entry and print a warning if the mood is below 3.

    String date;
    String title;

    public void Entry(String date,String title){
        this.date=date;
        this.title=title;
    }
}
