package com.xworkz.banking.service;

import java.util.Currency;

public class BankingService {

    public static String transferMoney(String toAccount, double amount){
        System.out.println("Transfer Account to :"+toAccount+"  Amount :"+amount);
        return "";
    }
    public static String transferMoney(String toAccount, double amount, String remarks){
        System.out.println("Transfer Account to :"+toAccount+"  Amount :"+amount);
        System.out.println("Remarks :"+remarks);
        return "";
    }
    public static String transferMoney(String toAccount, double amount, String currency, double exchangeRate) {
        if (currency == "$") {
            double finalExchangeRate = exchangeRate * amount;
            System.out.println("Transfer Account to :" + toAccount + "  " + currency + "  Amount :" + amount);
            System.out.println("Final Exchange Rate :"+finalExchangeRate);
        }
        return "";
    }
}
