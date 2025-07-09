package com.xworkz.runner;

import com.xworkz.exception.NameCheckException;

public class NameCheckRunner {

    public static void main(String[] args) {
        String name ="Dinesh";
        if (name.length()<3 && name.length()>25){

            throw new NameCheckException("Name is not Valid");
        }else {
            System.out.println("Name is Valid");
        }
    }
}
