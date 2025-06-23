package com.xworkz.runner;

import com.xworkz.exception.EmailCheckException;

public class EmailCheckExcepRunner {
    public static void main(String[] args) {

        String mailID = "danealdinesh@gmail.com";
        if (!(mailID.contains("@"))) {

            throw new EmailCheckException("The Email ID is Not Valid");
        }else{
            System.out.println("The Email is Valid");
        }
    }

}
