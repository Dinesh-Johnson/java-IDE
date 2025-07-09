package com.xworz.method.chaining;

public class BankAccount {
    public BankAccount(){
        this("Savings","Dinesh");
        System.out.println("Bank Account Opening");
    }
    public BankAccount(String type,String Name){
        System.out.println("Bank Account Typer :"+type);
        System.out.println("Acount Holder Name :");
        System.out.println();
    }
    public static void account(){
        account(5000);
        System.out.println("..Main Account Minimum Balnace..");
    }
    public static void account(int minBalance){
        System.out.println("Your Account Minimum balance :"+minBalance);
        System.out.println();
    }
    public void card(){
        card("Debit Card");
        System.out.println("..Your Card Details..");
    }
    public void card(String cardtype){
        System.out.println("Your Card type :"+cardtype);
    }

}
