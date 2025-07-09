package com.xworkz.things.methods;

public class BankAccount {
public String accNumber;

    public BankAccount(String number) {

        this.accNumber = number;
    }

    public String toString() {

        return "Account: " + accNumber;
    }
}