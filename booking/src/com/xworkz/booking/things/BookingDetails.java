package com.xworkz.booking.things;

import com.xworkz.booking.constants.DayNamesConstant;
import com.xworkz.booking.constants.MonthNameConstant;
import com.xworkz.booking.constants.PaymentMode;


public class BookingDetails {

    private DayNamesConstant dayNames;
    private MonthNameConstant monthNames;
    private PaymentMode paymentMode;


    public BookingDetails(DayNamesConstant dayNames, MonthNameConstant monthNames, PaymentMode paymentMode) {
        this.dayNames = dayNames;
        this.monthNames = monthNames;
        this.paymentMode = paymentMode;
    }

    public void calculateDiscount() {
        if (monthNames == MonthNameConstant.JUNE) {
            System.out.println("Discount: 10% on payment");
        } else {
            System.out.println("Discount: 5% on payment");
        }
    }
}

