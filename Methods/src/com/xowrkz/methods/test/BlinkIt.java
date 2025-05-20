package com.xowrkz.methods.test;

public class BlinkIt {

    public static void main(String[] args) {

        String[] items={"Headset","HeadPhones","20w Charger"};
        int[] price={1200,2500,1800};

        for(int i=0; i<items.length; i++){
            if(items[i]=="Headset"){

                System.out.println("This item is availabe and the price is ="+items[i]);
            }

        }
    }
}
