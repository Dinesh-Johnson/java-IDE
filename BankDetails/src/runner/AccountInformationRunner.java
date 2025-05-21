package runner;

import com.xworkz.bank.information.AccountInforamtion;

public class AccountInformationRunner {
    public static void main(String[] args) {

        int accBalance = AccountInforamtion.balance();
        System.out.println();

        int remBalance =AccountInforamtion.balance(accBalance,300);
        System.out.println("Your remaing Account Balance is"+remBalance);

        String name=AccountInforamtion.balance("Dinesh",123456789);
        System.out.println(name);

        String accName=AccountInforamtion.balance("Daneal Dinesh");
        System.out.println(accName);
    }
}
