package com.xworkx.in.guestmain;

import java.util.ArrayList;
import java.util.Collections;

public class Example24 {

    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<String>();
        alphabets.add("X");
        alphabets.add("Y");
        alphabets.add("Z");

        Collections.reverse(alphabets);

        for (String ch : alphabets) {
            System.out.println(ch);
        }
    }
}
