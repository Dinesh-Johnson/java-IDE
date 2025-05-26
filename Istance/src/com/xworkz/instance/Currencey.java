package com.xworkz.instance;

public class Currencey {

    public double usd;
    public double rate=0.012;
    public String costName="Rupees";

    public Currencey(double usd) {
        this.usd = usd;
        System.out.println("USD: $" + usd);
    }

    public Currencey(double inr, String costName) {
        this.usd = inr * rate;
        System.out.println("Rupees :"+inr+" "+costName);
        System.out.println("Converted USD: $" + this.usd);
    }

}
