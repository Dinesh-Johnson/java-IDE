package com.xworkz.instance;

public class Temperature {

    public double celsius;
    public double fahrenheit;
    public double convert;

    public Temperature(double celsius) {
        System.out.println("Celsius: " + celsius);
        this.celsius = celsius;
    }

    public Temperature(double fahrenheit,double celsius) {
        this.convert= (fahrenheit - 32) * 5 / 9;
        this.fahrenheit=fahrenheit;
        System.out.println("The Fahrenheit is :"+fahrenheit);
        System.out.println("Converted Celsius: " + convert);
    }


}
