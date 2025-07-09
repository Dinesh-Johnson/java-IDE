package com.xworkz.inerfaces.repository;

import com.xworkz.inerfaces.state.PassportData;

public class PassportSaveUserImpl implements PassportUserRepository {

PassportData[] passportDataArray = new PassportData[5];
    int index=0;

    @Override
    public boolean saveDetails(PassportData passportData) {
        if(index<passportDataArray.length&& passportData!= null){
            passportDataArray[index] = passportData;
            System.out.println("User Data saved");
            index++;
            return true;
        }else {
            System.err.println("Limit is Full");
        }

        return false;
    }

    @Override
    public boolean deleteDetails(String passportnumber) {
        for (int i = 0; i < index; i++) {
            if (passportDataArray[i].getPassportNumber()==passportnumber){
                passportDataArray[i]=null;
                System.out.println("User Data Deleted :"+passportnumber);
                return true;
            }else {
                System.err.println(passportnumber+" not Found");
            }

        }
        return false;
    }

    @Override
    public boolean updateDeatilsbyPassporNumber(String passportnumber, PassportData newPassportData) {
        for (int i = 0; i < index; i++) {
            if (passportDataArray[i].getPassportNumber()==passportnumber){
                passportDataArray[i]=newPassportData;
                return true;
            }
            else {
                System.err.println(passportnumber+" not Updated");
            }
        }
        return false;
    }

    @Override
    public boolean searchByProperties(String passportnumber) {
        for (int i = 0; i < index; i++) {
            if (passportDataArray[i].getPassportNumber()==passportnumber){
                System.out.println("Search results :"+passportDataArray[i]);
            }
            else {
                System.err.println(passportnumber+" not Found");
            }
        }
        return false;
    }
}
