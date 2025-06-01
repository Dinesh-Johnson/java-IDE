package com.xworkz.assignment.bank;

public class BankAccount {

    //1. Access Modifiers with Inheritance
    //Create a class com.xworkz.assignment.bank.BankAccount with protected data members balance.
    // Create a subclass com.xworkz.assignment.bank.SavingsAccount that adds an interest rate and a method to calculate interest.
    // Show how balance is accessed and updated.
   protected double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public double getbalance(){

        return balance;
    }

}
