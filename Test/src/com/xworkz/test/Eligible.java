package com.xworkz.test;

public class Eligible {
    public static void main(String[] args) {

        int age =26;
        int income=4000;
        boolean coupon=true;
        boolean member= false;

        if(age>25 && age<60 && income>=3000){
            System.out.println("This person is eligible");
        }
        if (coupon==true || member==true) {
            System.out.println("This person is eligible");
        }
        else {
            System.out.println("This person is not eligible");
        }
    }
}
