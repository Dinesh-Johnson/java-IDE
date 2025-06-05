package com.xworkz.assoication.things;

public class Account {

    long accNumber;
    double accBalance;

    public Account(long accNumber, double accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "AccountNumber{" +
                "accNumber=" + accNumber +
                ", accBalance=" + accBalance +
                '}';
    }
}
