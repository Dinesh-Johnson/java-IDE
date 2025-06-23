package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.interfaces.UserPassportService;
import com.xworkz.inerfaces.repository.PassportSaveUserImpl;
import com.xworkz.inerfaces.repository.PassportUserRepository;
import com.xworkz.inerfaces.state.PassportData;
import com.xworkz.inerfaces.subclass.PassportDataImpl;

public class PassportRunner {

    public static void main(String[] args) {

        UserPassportService userPassportService=new PassportDataImpl();
        PassportUserRepository passportUserRepository= new PassportSaveUserImpl();
        PassportData passportData1=new PassportData();
        passportData1.setName("Dinesh");
        passportData1.setPassportNumber("I1234567");
        passportData1.setAge(28);
        passportData1.setNationality("Indian");
        passportUserRepository.saveDetails(passportData1);

        PassportData passportData2=new PassportData();
        passportData2.setName("Daneal");
        passportData2.setAge(27);
        passportData2.setPassportNumber("W1234568");
        passportData2.setNationality("Indian");
        passportUserRepository.saveDetails(passportData2);

        PassportData passportData3=new PassportData();
        passportData3.setName("Virat");
        passportData3.setAge(17);
        passportData3.setNationality("British");
        passportData3.setPassportNumber("UK12456");
        passportUserRepository.saveDetails(passportData3);
        passportUserRepository.updateDeatilsbyPassporNumber("W1234568",passportData2);

        passportUserRepository.searchByProperties("UK12456");
        passportUserRepository.deleteDetails("I1234567");


    }
}
