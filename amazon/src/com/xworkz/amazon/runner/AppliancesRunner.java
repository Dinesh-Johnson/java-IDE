package com.xworkz.amazon.runner;


import com.xworkz.amazon.repository.AppliancesRepoImpl;
import com.xworkz.amazon.repository.AppliancesRepository;
import com.xworkz.amazon.things.Appliances;

import java.util.Collection;
import java.util.Iterator;

public class AppliancesRunner {
    public static void main(String[] args) {

        AppliancesRepository appliancesRepository= new AppliancesRepoImpl();
        Collection<Appliances> appliances= appliancesRepository.findAll();

        Iterator<Appliances> iterator = appliances.iterator();
        while (iterator.hasNext()) {
            Appliances a = iterator.next();
            if (a.getCost() > 20000) {
                System.out.println(a);
            }
        }


    }
}
