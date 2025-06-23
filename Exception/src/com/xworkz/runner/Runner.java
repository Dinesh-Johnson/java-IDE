package com.xworkz.runner;

public class Runner {
    public static void main(String[] args) {

        String name =null;
        try{

            System.out.println(name.length());
        }catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }
}
