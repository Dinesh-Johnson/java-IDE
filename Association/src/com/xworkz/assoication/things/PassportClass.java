package com.xworkz.assoication.things;

public class PassportClass {
    String personName;
    PersonPassport passport;

    public PassportClass(String personName, PersonPassport passport) {
        this.personName = personName;
        this.passport = passport;
    }

    public boolean showPassportDetails() {
        System.out.println("Person: " + personName);
        if (passport != null) {
            System.out.println(passport);  // Calls toString()
        } else {
            System.out.println("No passport assigned.");
        }
        return false;
    }
}
