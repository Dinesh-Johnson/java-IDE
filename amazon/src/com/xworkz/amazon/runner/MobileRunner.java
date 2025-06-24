package com.xworkz.amazon.runner;

import com.xworkz.amazon.repository.MobileRepo;
import com.xworkz.amazon.repository.MobileRepoImpl;
import com.xworkz.amazon.things.MobileDTO;

import java.util.Collection;

public class MobileRunner {

    public static void main(String[] args) {

        MobileRepo mobileRepo= new MobileRepoImpl();
        Collection<MobileDTO> collection= mobileRepo.findAll();


        for(MobileDTO m : collection){
            if(m.getRamGB()>=8){
                System.out.println(m);
            }
        }
    }
}
