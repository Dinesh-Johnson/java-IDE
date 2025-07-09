package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Temperature;

public class TemperaturRunner {

    public static void main(String[] args) {

        Temperature temp=new Temperature();
        temp.setCelsius(30);
        System.out.println("Celcius :"+temp.getCelsius());
        System.out.println("Into Fahrenheit :"+temp.fahrenheit());
        System.out.println("Into Kelvin :"+temp.kelvin());
    }
}
