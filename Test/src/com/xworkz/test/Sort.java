package com.xworkz.test;

public class Sort {
    public static void main(String[] args) {

        int value[]={5,8,56,12,63,22,10};
        int a=0;
        for (int i = 0; i < value.length; i++) {
            for (int j = i+1; j < value.length; j++) {
                if(value[i]<value[j]){
                    int b=value[i];
                    value[i]=value[j];
                    value[j]=b;
                }
            }
        }
        for(int i=0;i< value.length;i++){
            System.out.println(value[i]);
        }
    }
}
