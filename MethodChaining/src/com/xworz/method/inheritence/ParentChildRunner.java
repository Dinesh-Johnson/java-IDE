package com.xworz.method.inheritence;

public class ParentChildRunner {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.attidude();

        Child c1=new Child();
        c1.allergies=false;
        c1.genre ="Melody";
        c1.name("lannisters");


        Parent p2= new Child();// CHILD-1
        p2.allergies=false;
        p2.skinColour="White";
        p2.attidude();
        p2.name("Lannisters");


        Parent c2 = new Child2(); //CHILD -2
        c2.allergies=false;
        c2.skinColour="White";
        c2.hairType="Blonde";

        Child c3= new Child3();
        c3.genre="Classic";
        c3.age=8;


    }
}
