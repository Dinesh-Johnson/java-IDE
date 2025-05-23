package com.xworkz.polymophsim;

public class Plants {

    public static void plant(){
        System.out.println("Details abount Plants");
    }
    public static void plant(String name){
        System.out.println("Plant Name :"+name);
    }
    public static void plant(String name,int qty){
        System.out.println("Plant Name :"+name+"-"+qty);
    }
}
