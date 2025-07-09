package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.User;

import javax.jws.soap.SOAPBinding;

public class UserRunner {
    public static void main(String[] args) {

        User user=new User();
        user.setUsername("Dinesh");
        user.setPassword("PASSWORD");
        user.username();
    }
}
