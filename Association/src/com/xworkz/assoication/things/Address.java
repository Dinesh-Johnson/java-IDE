package com.xworkz.assoication.things;

public class Address {
    private String location;
    private int pincode;
    private ContactDetails contactDetails;


    public Address(String location, int pincode, ContactDetails contactDetails) {
        this.location = location;
        this.pincode = pincode;
        this.contactDetails = contactDetails;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPincode() {
        return pincode;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                ", pincode=" + pincode +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
