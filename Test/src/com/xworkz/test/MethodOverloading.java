package com.xworkz.test;

public class MethodOverloading {

    public static String name(){
        System.out.println("Method Over loading");
        return "";
    }
    public static String name(int number){
        System.out.println(number+" Method Overloading");
        return "";
    }
    public static String name(int number,int number2){
        int sum = number+number2;
        System.out.println("The sum of Given number is ="+sum);
        return "";
    }

}
