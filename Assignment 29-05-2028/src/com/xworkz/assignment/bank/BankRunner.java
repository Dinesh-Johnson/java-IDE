package com.xworkz.assignment.bank;

public class BankRunner {
    public static void main(String[] args) {

        SavingsAccount sa=new SavingsAccount(30000,5 );
        sa.deposit(5000);
        System.out.println("Balance ="+sa.getbalance());
        System.out.println();
        System.out.println("Interest ="+sa.calcInterest());
    }
}
