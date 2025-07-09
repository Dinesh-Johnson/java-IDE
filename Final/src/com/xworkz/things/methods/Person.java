package com.xworkz.things.methods;

public class Person {
public String name;
public Passport passport;

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void showDetails() {

        System.out.println(name + ", " + passport);
    }

    public static void main(String[] args) {
        Passport p = new Passport("A12345");
        Person person = new Person("John", p);
        person.showDetails();
    }
}