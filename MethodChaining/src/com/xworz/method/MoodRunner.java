package com.xworz.method;

public class MoodRunner {
    public static void main(String[] args) {

        MoodEntry m=new MoodEntry();
        m.date="28-05-2025";
        System.out.println();

        m.title="MOOD";
        System.out.println();

        m.moodCheck();
        System.out.println();

        m.UserMood(3);
    }
}
