package com.xworkz.assoication.things;

public class PersonPassport {
    String passportNumber;
    String nationality;


    public PersonPassport(String passportNumber, String nationality) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "PersonPassport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
