package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Payment;

public class CreditcardPayment extends Payment {
    @Override
    public void methodPay() {
        System.out.println("Credit card Processing");
    }
}
