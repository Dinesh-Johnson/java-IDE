package com.xworkz.assoication.things;

public class Bank {

    String name;
    Account[] accounts;
    int count;

    public Bank(String name, Account[] accounts, int count) {
        this.name = name;
        this.accounts = accounts;
        this.count = count;
    }

    public void showBank(){
        System.out.println("Account name :"+name);
        System.out.println("..Banks Accounts are..");
        for (int i = 0; i < count; i++) {
            System.out.println(" -"+accounts[i]);
        }
    }
    public double toBalance(){
        double total=0;
        for (int i = 0; i < count; i++) {
            total+=accounts[i].accBalance;
        }
        return total;
    }
}
