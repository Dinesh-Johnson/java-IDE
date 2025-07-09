package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Account;
import com.xworkz.assoication.things.Bank;

public class BankRunner {
    public static void main(String[] args) {


        Account account1=new Account(455525223l,52355.00);
        Account account2=new Account(455252214l,42420.00);


        Account[] bankAcc=new Account[2];
        bankAcc[0]=account1;
        bankAcc[1]=account2;

        Bank bank=new Bank("Punjab National Bank",bankAcc,2);

        bank.showBank();
        System.out.println("Total Accounts Balance ="+bank.toBalance());


    }
}
