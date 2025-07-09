package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.BankAccount;

public class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber("PNB552364152");
        bankAccount.deposit(10000);
        bankAccount.withdraw(1000);
        System.out.println("Acc no. :"+bankAccount.getAccountNumber());
        System.out.println("Remaining Balance amount :"+bankAccount.getBalance());

    }
}
