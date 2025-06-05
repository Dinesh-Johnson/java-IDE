package com.xworkz.assoication.things;

public class ContactDetails {
    private String email;
    private long mobile;

    public ContactDetails(String email, long mobile) {
        this.email = email;
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
