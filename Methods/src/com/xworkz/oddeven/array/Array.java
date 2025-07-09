package com.xworkz.oddeven.array;

public class Array {

    public static void Array(int[] intArray){
        for(int i=0;i< intArray.length;i++){
            if(intArray[i]%2==0){
                System.out.println("The Even Numbers are :"+intArray[i]);
            }
        }
    }
    public static void Arrays(int[] sixArray){
        for (int j=0;j<sixArray.length;j++){
            if (sixArray[j]%6==0){
                System.out.println("This Numbers are Divisible by 6  : "+sixArray[j]);
            }
        }
    }
}
