package com.xworkz.test;

public class Vowels {
    public static void main(String[] args) {

        char vowels[]={'a','e','i','o','u'};
        char value='b';

        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == value) {
                System.out.println("It is a Vowel");
            }
            else {
                System.out.println("It is a Constant");
            }
        }
    }
}
