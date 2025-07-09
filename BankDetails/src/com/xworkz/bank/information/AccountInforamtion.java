package com.xworkz.bank.information;

public class AccountInforamtion {

    public static int balance(){
        System.out.println("Your Total Balnce is ");
        return 13560;
    }
    public static int balance(int balance, int withdrawAmount) {
        System.out.println("The Remaining Balance =");
        return balance-withdrawAmount;
    }
    public static String balance(String customerName,int accountNumber){
        System.out.println("Account Deatils");
        return customerName;
    }
    public static String balance(String customerName){
        System.out.println("The Coustomer Name is");
        return customerName;
    }

}
