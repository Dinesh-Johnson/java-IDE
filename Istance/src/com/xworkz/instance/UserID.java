package com.xworkz.instance;

public class UserID {

    public String username;
    public String password;
    public String email;
    public int phoneNumber;

    public UserID(String username, String password){
        System.out.println("Welcome Create Username and Password");
        this.username = username;
        this.password = password;
    }
    public UserID(String username, String password,String email){
        System.out.println("You Mail Address");
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public UserID(String username, String password,String email,int phoneNumber){
        System.out.println("User ful details include Phone Number");
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
