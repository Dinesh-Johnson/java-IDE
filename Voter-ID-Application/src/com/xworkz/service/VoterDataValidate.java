package com.xworkz.service;


import com.xworkz.exception.*;
import com.xworkz.things.VoterIDdetails;

public class VoterDataValidate implements VoterDetailService {


    @Override
    public boolean isValidation(VoterIDdetails voterIDdetails) {
        if (voterIDdetails != null) {
            if (voterIDdetails.getName() != null) {
                if (!(voterIDdetails.getName().length() <= 2) && (voterIDdetails.getName().length() > 2 || voterIDdetails.getName().length() < 30)) {
                    System.out.println("Name is Valid");
                } else {
                    throw new NameException("Name is Invalid");
                }
            }
            if (voterIDdetails.getFatherName() != null) {
                if (!(voterIDdetails.getFatherName().length() <= 2) && (voterIDdetails.getFatherName().length() > 2 || voterIDdetails.getFatherName().length() < 30)) {
                    System.out.println("Father Name is Valid");
                } else {
                    throw new FatherNameExcep("Father Name is Invalid");
                }
            }
            if (voterIDdetails.getAge() != 0) {
                if (voterIDdetails.getAge() >= 18) {
                    System.out.println("You Have Right to Vote");
                } else {
                    throw new AgeException("You are Not Elgible to Vote");
                }
            }
            if (voterIDdetails.getContactNumber() != 0) {
                if (voterIDdetails.getContactNumber() > 900000000 && voterIDdetails.getContactNumber() <= 999999999) {
                    System.out.println("Contact Number is Valid");
                } else {
                    throw new ContactNumberExcep("Contact Number is Invalid");
                }
            }
            if (voterIDdetails.getEmail() != null) {
                if (!(voterIDdetails.getEmail().contains("@")) && (voterIDdetails.getEmail().endsWith(".com") || (voterIDdetails.getEmail().endsWith(".in")))) {
                    System.out.println("Email Id is Valid");
                } else {
                    throw new EmailExcep("Email Id is Invalid");
                }
            }
            if (voterIDdetails.getAadharCard() != 0) {
                if (voterIDdetails.getAadharCard() > 100000000 && voterIDdetails.getAadharCard() < 999999999) {
                    System.out.println("Aadhar Number is Valid");
                } else {
                    throw new AadharExcep("Aadhar Number is Invalid");
                }
            }
            if (voterIDdetails.getCity() != null) {
                if (!(voterIDdetails.getCity().length() <= 2) && (voterIDdetails.getCity().length() > 2 || voterIDdetails.getCity().length() < 18)) {
                    System.out.println("City is Valid");
                } else {
                    throw new CityExcep("City is Not Found");
                }
            }
            if (voterIDdetails.getState() != null) {
                if (voterIDdetails.getState().contains("Karnataka")) {
                    System.out.println("You are Elgible to Vote in Karnataka");
                } else {
                    throw new StateExcep("You are not Elgible to Vote in Karnataka");
                }
            }
            if (voterIDdetails.getCountry() != null) {
                if (voterIDdetails.getCountry().contains("India")) {
                    System.out.println("You are Elgible to Vote in INDIA");
                } else {
                    throw new ContactNumberExcep("You are not Elgible to Vote in INDIA");
                }
            }
            if (voterIDdetails.getAddress() != null) {
                if (!(voterIDdetails.getAddress().length() <= 2) && (voterIDdetails.getAddress().length() > 2 || voterIDdetails.getAddress().length() < 30)) {
                    System.out.println("Your Address is Valid");
                } else {
                    throw new AddressExcep("Your Address is not Valid");
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
