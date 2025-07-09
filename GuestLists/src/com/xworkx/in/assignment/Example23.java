package com.xworkx.in.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Example23 {

    public static void main(String[] args) {
        HashSet<String> langSet = new HashSet<String>();
        langSet.add("HTML");
        langSet.add("CSS");

        ArrayList<String> langList = new ArrayList<String>(langSet);

        for (String lang : langList) {
            System.out.println(lang);
        }
    }

}
