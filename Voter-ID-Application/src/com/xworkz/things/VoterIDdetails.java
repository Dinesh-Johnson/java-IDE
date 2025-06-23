package com.xworkz.things;

public class VoterIDdetails {

    String name;
    int age;
    long contactNumber;
    String email;
    long aadharCard;
    String city;
    String State;
    String Country;
    String Address;
    String fatherName;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAadharCard(long aadharCard) {
        this.aadharCard = aadharCard;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        State = state;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getAddress() {
        return Address;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public long getAadharCard() {
        return aadharCard;
    }

    @Override
    public String toString() {
        return "VoterIDdetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                ", aadharCard=" + aadharCard +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", Address='" + Address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
