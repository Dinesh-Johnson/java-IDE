package com.xworkz.things.methods;

public class Customer {
public String name;
public BankAccount[] accounts;

    public Customer(String name, BankAccount[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void showAccounts() {

         System.out.println("Customer: " + name);
        for (int i = 0; i < accounts.length; i++) {

             System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BankAccount[] accs = {
            new BankAccount("111"),
            new BankAccount("222")
        };
        Customer c = new Customer("Raj", accs);
        c.showAccounts();
    }
}