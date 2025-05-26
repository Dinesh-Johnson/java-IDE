package com.xworkz.instance;

public class EmailUser {

    public String email;
    public String password;

    public EmailUser(String email, String password) {
        this.email = email;
        this.password = password;
        System.out.println("Email: " + email + ", Password: " + password);
    }

    public EmailUser(String email) {
        this.email = email;
        this.password = "1234";
        System.out.println("Email: " + email + ", Default Password:"+password);
    }
}
