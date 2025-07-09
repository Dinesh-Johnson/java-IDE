package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.Payment;
import com.xworkz.abstracts.child.CashPayment;
import com.xworkz.abstracts.child.CreditcardPayment;

public class PaymentRunner {
    public static void main(String[] args) {

        Payment payment=new CreditcardPayment();
        payment.methodPay();

        Payment payment1=new CashPayment();
        payment1.methodPay();
    }
}
