package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.UserDetails;
import com.xworkz.abstracts.child.UserInformation;
import com.xworkz.abstracts.child.UserService;

public class UserRunner {
    public static void main(String[] args) {

        UserInformation userInformation=new UserInformation();

        userInformation.setName("Dinesh");
        userInformation.setMobile(98745631);
        UserDetails userDetails=new UserService();
        System.out.println("--------------");

        boolean userDetails1= userDetails.showUser(userInformation);
        if(userDetails1){
            System.out.println("the user detail is true");
        }
        else {
            System.err.println("the user detail is false");
        }

        boolean userDetails2= userDetails.showUser(userInformation);
        if(userDetails2){
            System.out.println("the user detail is true");
        }
        else {
            System.err.println("the user detail is false");
        }
        boolean userDetails3= userDetails.showUser(userInformation);
        if(userDetails3){
            System.out.println("the user detail is true");
        }
        else {
            System.err.println("the user detail is false");
        }
        boolean userDetails4= userDetails.showUser(userInformation);

    }
}
