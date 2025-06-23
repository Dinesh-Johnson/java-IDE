package com.xworkz.runner;

public class TCBuiltInExceptionRunner {
    public static void main(String[] args) {

        try {
            int a=10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        try{
            String name=null;
            name.length();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        try{
            int[] number={1,2};
            System.out.println(number[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        try{
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
