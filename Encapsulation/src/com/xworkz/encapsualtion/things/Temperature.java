package com.xworkz.encapsualtion.things;

public class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getCelsius() {
        return celsius;
    }
    public double fahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    public double kelvin() {
        return celsius + 273.15;
    }

}
