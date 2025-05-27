package com.xworz.method;

public class SuperMarket {

    public SuperMarket(){
        this("D Mart");
        System.out.println("Default Supermarket");
    }
    public SuperMarket(String name){

        System.out.println("Supermarket Name is :"+name);
    }
    public static String offers(String offers,double percentage){
        System.out.println(offers+"-Discount");
        return "";
    }
    public static int offer(){
        System.out.println("Applying Dicounts...");
        SuperMarket s=new SuperMarket();
        s.store("Electronics","Toys");
        return 0;
    }
    public void store(){
        store("Toys","Electronics");
        System.out.println("Categories");
    }
    public void store(String categories,String categories1){
        System.out.println(categories+" and "+categories1);
    }
    public SuperMarket(int i){
        offers("50%",0.50d);
        System.out.println(i+" Categories are there");

    }
}
