package com.xworkz.encapsualtion.things;

public class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void username() {
        System.out.println("Username: " + username);
    }
}
