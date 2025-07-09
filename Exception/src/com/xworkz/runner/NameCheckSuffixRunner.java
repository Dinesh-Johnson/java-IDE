package com.xworkz.runner;

import com.xworkz.exception.NamePreffixCheck;

public class NameCheckSuffixRunner {
    public static void main(String[] args) {
        String name="Anthony";
        if (!(name.startsWith("A"))){

            throw new NamePreffixCheck("Name Contains A as the First Letter");
        }else {
            System.out.println("Name is Valid");
        }
    }
}
