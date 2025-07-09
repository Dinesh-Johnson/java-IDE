package com.xworkz.instance;

public class Distance {

    public double kilometers;
    public double convert;

    public Distance(double kilometers){
        System.out.println("Distance is km :"+kilometers);
        this.kilometers=kilometers;
    }
    public Distance(double miles,double kilometers){
        this.convert=kilometers * 1.609;
        System.out.println("Converted given Miles to km is :"+convert);
        this.kilometers=kilometers;

    }
}
