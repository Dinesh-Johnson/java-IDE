package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Payment;

public class CashPayment extends Payment {
    @Override
    public void methodPay() {
        System.out.println("Paid using Cash");
    }
}
