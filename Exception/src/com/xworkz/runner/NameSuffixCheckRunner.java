package com.xworkz.runner;

import com.xworkz.exception.NameSuffixCheck;

public class NameSuffixCheckRunner {
    public static void main(String[] args) {
        String name="VINODA";
        if (name.endsWith("A")){

            throw new NameSuffixCheck("The Name is ends with A");
        }else {
            System.out.println("The Name is Valid");
        }

    }
}
