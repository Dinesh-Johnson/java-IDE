package com.xworkx.in.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Example17 {
    public static void main(String[] args) {
        ArrayList<String> codes = new ArrayList<String>();
        codes.add("A1");
        codes.add("B2");

        HashSet<String> codeSet = new HashSet<String>(codes);

        System.out.println(codes);

    }
}
