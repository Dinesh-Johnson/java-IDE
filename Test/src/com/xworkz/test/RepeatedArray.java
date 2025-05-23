package com.xworkz.test;

public class RepeatedArray {

    public static void main(String[] args) {

        int value[]={5,1,3,1,2,44,1};
        for (int i = 0; i < value.length; i++) {
            if(value[i]==value[6-i]){
                System.out.println(value[i]);
            }

        }
    }
}
