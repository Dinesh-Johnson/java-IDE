package com.xworkz.booking.runner;

import com.xworkz.booking.constants.DayNamesConstant;
import com.xworkz.booking.constants.MonthNameConstant;
import com.xworkz.booking.constants.PaymentMode;
import com.xworkz.booking.things.BookingDetails;
import com.xworkz.booking.things.RegistrationDetails;

public class BookingRunner {
    public static void main(String[] args) {

        BookingDetails bookingDetails=new BookingDetails(DayNamesConstant.FRIDAY, MonthNameConstant.JUNE, PaymentMode.CASH);
        bookingDetails.calculateDiscount();
        System.out.println();

        RegistrationDetails registrationDetails=new RegistrationDetails();
        registrationDetails.setAge(20);
        registrationDetails.calculateDiscount();


    }
}
