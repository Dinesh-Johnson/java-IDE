package com.xworkz.test;

public class MaximumMinimum {

    public static void main(String[] args) {

        int[] values={25,42,17,36,2,10};
        int max=values[0];
        int min=values[0];
        for(int i=0;i< values.length;i++){
            if(values[i]>max){
                max=values[i];
            } else if (values[i]<min) {
                min=values[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
