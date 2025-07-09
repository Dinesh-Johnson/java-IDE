package com.xworkz.assignment.invoice;

public class InvoiceRunner {
    public static void main(String[] args) {

        Invoice invoice=new Invoice();

        System.out.println("Items :"+invoice.generateInvoice(5,10.5));
        System.out.println("Items with Discount :"+invoice.generateInvoice(5,10.5,15));
        System.out.println("Items with Tax:"+invoice.generateInvoice(5,10.5,15,5));
    }
}
