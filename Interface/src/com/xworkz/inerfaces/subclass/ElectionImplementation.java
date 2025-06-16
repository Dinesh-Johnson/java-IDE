package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.ElectionService;
import com.xworkz.inerfaces.state.ElectionProp;

public class ElectionImplementation implements ElectionService {

    @Override
    public boolean validation(ElectionProp userDetails) {

        boolean isValidation=true;
        if (userDetails != null){
            if (userDetails.getUsername()!=null){
                if (!(userDetails.getUsername().length()<=2) && (userDetails.getUsername().length()>2|| userDetails.getUsername().length()<30)){
                    System.out.println("Username Validated");
                    isValidation=false;
                }else {
                    System.out.println("Username not valid");
                    isValidation=true;
                }
            }
            if(userDetails.getEmail()!=null) {
                if ((userDetails.getEmail().contains("@")) && (userDetails.getEmail().endsWith(".com") || userDetails.getEmail().endsWith(".in"))) {
                    System.out.println("Email Validated");
                    isValidation=false;
                }else {
                    System.out.println("Email not valid");
                    isValidation=true;
                }
            }
            if (userDetails.getFatherName()!=null){
                if (!(userDetails.getFatherName().length()<=2) &&(userDetails.getFatherName().length()>2|| userDetails.getFatherName().length()<30)){
                    System.out.println("Father Name Validated");
                    isValidation=false;
                }else {
                    System.out.println("Father not valid");
                    isValidation=true;
                }
            }
            if (userDetails.getMotherName()!=null){
                if (!(userDetails.getMotherName().length()<=2) &&(userDetails.getMotherName().length()>2|| userDetails.getMotherName().length()<30)){
                    System.out.println("Mother Name Validated");
                    isValidation=false;
                }else {
                    System.out.println("Mother not valid");
                    isValidation=true;
                }
            }
            if (userDetails.getAddress()!=null){
                if (!(userDetails.getAddress().length()<=2) &&(userDetails.getAddress().length()>2|| userDetails.getAddress().length()<30)){
                    System.out.println("Address Validated");
                    isValidation=false;
                }else {
                    System.out.println("Address not valid");
                    isValidation=true;
                }
            }
            if (userDetails.getAge()!=0){
                if (userDetails.getAge()>=18){
                    System.out.println("Age Validated");
                    isValidation=false;
                }else {
                    System.out.println("Age not valid");
                    isValidation=true;
                }
            }
        }
        return isValidation;
    }
}
