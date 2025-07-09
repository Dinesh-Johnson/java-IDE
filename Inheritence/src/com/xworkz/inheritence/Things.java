package com.xworkz.inheritence;

public class Things {

    public String object;

    public Things(){
        System.out.println("Things");
    }
    public Things(String name){
        System.out.println("The Name of the Object :"+name);
    }
    public Things(String name,int qty){
        System.out.println(name+"-"+qty);
    }
    public void type(){
        System.out.println("The type of Table is :"+object);
    }
}
