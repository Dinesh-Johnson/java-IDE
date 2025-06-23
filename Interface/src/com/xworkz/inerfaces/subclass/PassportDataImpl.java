package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.UserPassportService;
import com.xworkz.inerfaces.state.PassportData;

public class PassportDataImpl implements UserPassportService {

    @Override
    public boolean validation(PassportData passportData) {
        if (passportData!= null){
            if (passportData.getName()!=null) {
                if (!(passportData.getName().length() <= 2) && (passportData.getName().length() > 2 || passportData.getName().length() < 30)) {
                    System.out.println("Name Validated");
                    return false;
                } else {
                    System.err.println("Name not valid");
                    return true;
                }
            }
            if (passportData.getPassportNumber()!=null){
                if (passportData.getPassportNumber().length()==8){
                    System.out.println("Passport Number is valid");
                    return false;
                }else {
                    System.err.println("Passport Number is inValid");
                }
            }
            if (passportData.getAge()!=0){
                if (passportData.getAge()>=18){
                    System.out.println("Age is valid");
                }else{
                    System.err.println("Your Age should be 18");
                }
            }
            if (passportData.getNationality()!=null){
                if (passportData.getNationality()=="Indian"){
                    System.out.println("You are Eligible");
                }
                else {
                    System.err.println("You are Not Indian");
                }
            }

        }
        return false;
    }
}
