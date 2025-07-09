package com.xworkz.runner;

import com.xworkz.exception.MonthCheckException;

public class MonthRunner {


    public static void main(String[] args) {

        String month="May";
        try {
            System.out.println(month.length());
            throw new MonthCheckException("Month is invalid");
        } catch (MonthCheckException e) {
            e.printStackTrace();

        }
    }
}
