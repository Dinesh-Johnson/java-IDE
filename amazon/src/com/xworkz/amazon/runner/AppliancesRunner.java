package com.xworkz.amazon.runner;


import com.xworkz.amazon.repository.AppliancesRepoImpl;
import com.xworkz.amazon.repository.AppliancesRepository;
import com.xworkz.amazon.things.Appliances;

import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {

        AppliancesRepository appliancesRepository= new AppliancesRepoImpl();
        Collection<Appliances> appliances= appliancesRepository.findAll();

        for (Appliances a : appliances){
            if (a.getCost()>20000) {
                System.out.println(a.getName());
            }
        }


    }
}
