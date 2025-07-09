package com.xworkz.runner;

import com.xworkz.exception.ArrayCheckException;

public class ArrayCheckExceptionRunner {

    public static void main(String[] args) {
        String[] names={"AB"};
        if (names.length<2){

            throw new ArrayCheckException("The Array Length is Less than 2");
        }else {
            System.out.println("The Array Length is Greater Than 2");
        }
    }
}
