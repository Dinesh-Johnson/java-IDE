package com.xworz.method;

public class MoodEntry extends Entry{
    //2. Create a base class Entry that stores a date and a title. Derive a class MoodEntry that stores the user's mood level (1 to 10).
    //Write a program that allows the user to create a mood entry and print a warning if the mood is below 3.

    int userMood;

    public void UserMood(int userMood){
        this.userMood=userMood;
    }
    public void moodCheck(){
        if (userMood <= 3) {
            System.out.println("Warning: Low mood.");
        }
    }
}
