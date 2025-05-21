package com.xworkz.banking.service;

public class BankingServiceRunner {

    public static void main(String[] args) {

        BankingService.transferMoney("Dinesh",10250.00);
        System.out.println();

        BankingService.transferMoney("Dinesh",10250.00,"No remarks");
        System.out.println();

        BankingService.transferMoney("Dinesh",10250.00,"$",85.59);
        System.out.println();
    }
}
