package com.xworz.method;

public class Employee {
    //6. Create a class Employee with common fields like name and ID. Derive Engineer and Manager classes with their specific responsibilities.
    //Write a program to create both objects and call their specific methods using polymorphism.

    String name;
    int id;

    public void employee(String name,int id){
        this.id=id;
        this.name=name;
    }
    public void work(){
        System.out.println(name+"-"+id);
    }
}
