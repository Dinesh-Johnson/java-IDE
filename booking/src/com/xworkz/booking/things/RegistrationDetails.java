package com.xworkz.booking.things;

public class RegistrationDetails {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void calculateDiscount() {
        if (age < 18) {
            System.out.println("Discount: 20%");
        } else if (age > 60) {
            System.out.println("Discount: 25%");
        }
        else{
            System.out.println("Discount: 10%");
        }
    }
}
