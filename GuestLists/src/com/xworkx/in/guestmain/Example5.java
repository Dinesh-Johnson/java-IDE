package com.xworkx.in.guestmain;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<String>();
        subjects.add("C");
        subjects.add("Python");
        subjects.add("Ruby");

        for (String subject : subjects) {
            if (subject == "Python") {
                System.out.println("Contains Python: true");
            }
        }
    }
}
