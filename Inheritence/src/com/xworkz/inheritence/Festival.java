package com.xworkz.inheritence;

public class Festival {

    public String holiday;

    public Festival(){
        System.out.println("Festival Details");
    }
    public Festival(String festival){
        System.out.println("Festival Name :"+festival);
    }
    public Festival(int date,String month){
        System.out.println("Date :"+date+" Month :"+month);
    }
    public void winter(){
        System.out.println("Type of Holiday is "+holiday);
    }
}
