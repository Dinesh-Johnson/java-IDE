package com.xworkz.amazon.product;

public class Amazon {

    public static void displayUserName(String productName,String customerName){
        System.out.println("The Product Name is"+productName);
        System.out.println("Customer Name is"+customerName);
    }
    public static void displayPrice(String[] listProductName,int[] listProductPrice,String customerName){
        for(int i=0;i< listProductName.length;i++){
            System.out.println("Proudct--"+(i+1)+"."+listProductName[i]+"Price--$"+listProductPrice[i]);
        }
    }
    public static void acceptArray(int[] integer,float[] floats,char[] character,String[] strings){
        for(int i=0;i<integer.length;i++){
            System.out.println("value i "+integer[i]);
        }
        System.out.println();
        for(int j=0;j< floats.length;j++){
            System.out.println("value j "+floats[j]);
        }
        System.out.println();
        for(int k=0;k< character.length;k++){
            System.out.println("Value k "+character[k]);
        }
        System.out.println();
        for(int l=0;l< strings.length;l++){
            System.out.println("value l "+strings[l]);
        }
        System.out.println();
    }
}
