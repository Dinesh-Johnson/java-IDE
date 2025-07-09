package com.xworkz.inheritence;

public final class MainClass {

    int a=10;       //non-static variable
    String b="Words";
    boolean c=true;
    double d =96.96;

    public static int a1=100;
    public static String b1="Static variable";
    public static boolean c2=false;

    public final static int a3=120;
    public final static String b3="final Static variable";
    public static final boolean c3=false;

    public final int A=1500;
    public final String B="final Non-Static variable";
    public final boolean C=true;

    public static void staticMethod(){
        System.out.println("Static method -1");
    }
    public static void staticMethod2(){
        System.out.println("Static method -2");
    }
    public void non_staticMethod1(){
        System.out.println("Non-Static method -1");
    }
    public void non_staticMethod2(){
        System.out.println("Non-Static method -2");
    }
    public final static void final_staticMethod(){
        System.out.println("Final Static method -1");
    }
    public final static void final_staticMethod2(){
        System.out.println("Final Static method -2");
    }
    public final void final_Non_staticMethod(){
        System.out.println("Final Non-Static method -1");
    }
    public final void final_Non_staticMethod2(){
        System.out.println("Final Non-Static method -2");
    }
    public MainClass(){
        System.out.println("Default Constructor");
    }
    public MainClass(String b,String b1){
        this.b=b;
        this.b1=b1;
    }
    public String toString(){
        return"";
    }



}
