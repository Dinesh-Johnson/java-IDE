package com.xworkz.inerfaces.repository;

import com.xworkz.inerfaces.state.PassportData;

public interface PassportUserRepository {

    boolean saveDetails(PassportData passportData);
    boolean deleteDetails(String Username);
    boolean updateDeatilsbyPassporNumber(String passportnumber, PassportData newPassportData);
    boolean searchByProperties(String passportnumber);
}
