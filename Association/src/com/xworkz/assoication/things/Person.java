package com.xworkz.assoication.things;

public class Person {
    private String personName;
    private int age;
    private Address address;

    public Person(String personName, int age, Address address) {
        this.personName = personName;
        this.age = age;
        this.address = address;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
