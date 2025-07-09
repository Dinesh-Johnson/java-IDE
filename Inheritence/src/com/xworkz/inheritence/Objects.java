package com.xworkz.inheritence;

public class Objects {

    public String thing;

    public Objects(){

        System.out.println("Objects");
    }
    public Objects(String name){
        System.out.println("Object Name :"+name);
    }
    public Objects(String[] objects,int quantity){
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]+"-"+quantity);
        }
    }
    public void type(){
        System.out.println("The Categories comes under "+thing);
    }
}
