package com.xworkx.in.assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example20 {
    public static void main(String[] args) {
        LinkedHashSet<String> languages = new LinkedHashSet<String>();
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
