package runner;

import com.xworz.method.chaining.BankAccount;

public class BankAccontRunner {
    public static void main(String[] args) {

        BankAccount b1=new BankAccount();
        System.out.println();
        BankAccount.account();
        System.out.println();
        b1.card();
        System.out.println();

    }
}
