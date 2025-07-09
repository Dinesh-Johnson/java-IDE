package com.xworkz.things.methods;

public class Passport {
public final String passportNumber;

    public Passport(String number) {
         this.passportNumber = number;
    }

    public String toString() {
         return "Passport Number: " + passportNumber;
    }
}