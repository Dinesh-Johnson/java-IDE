package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.PassportClass;
import com.xworkz.assoication.things.PersonPassport;

public class PassportRunner {
    public static void main(String[] args) {


    PersonPassport personPassport=new PersonPassport("5415A6D","Indian");
    PassportClass passportClass=new PassportClass("Dinesh",personPassport);

        System.out.println(personPassport);
        System.out.println(passportClass.showPassportDetails());
    }
}
