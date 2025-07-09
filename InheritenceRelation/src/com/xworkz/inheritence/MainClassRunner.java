package com.xworkz.inheritence;

public class MainClassRunner {
    public static void main(String[] args) {

        MainClass mc =new MainClass();
        mc.final_Non_staticMethod();//Final Non-Static method
        mc.final_Non_staticMethod2();
        mc.non_staticMethod1();//Non-Static method
        mc.non_staticMethod2();

        MainClass.final_staticMethod();
        MainClass.staticMethod();
        mc.toString();
    }
}
