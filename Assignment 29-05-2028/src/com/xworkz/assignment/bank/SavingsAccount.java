package com.xworkz.assignment.bank;

public class SavingsAccount extends BankAccount {

    private double interest;

    public SavingsAccount(double balance,double interest){
        super(balance);
        this.interest=interest;
    }
    public double calcInterest(){
        return balance * interest /100;
    }
}
