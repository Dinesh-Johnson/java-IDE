package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.Appliances;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppliancesRepoImpl implements AppliancesRepository {
    @Override
    public Collection<Appliances> findAll() {

        Appliances a1 = new Appliances("Washing Machine", 2, 25000, "LG", "Front Load", 2);
        Appliances a2 = new Appliances("Refrigerator", 1, 30000, "Samsung", "Double Door", 3);
        Appliances a3 = new Appliances("Microwave Oven", 3, 12000, "IFB", "Convection", 1);
        Appliances a4 = new Appliances("Air Conditioner", 1, 40000, "Voltas", "Split", 5);
        Appliances a5 = new Appliances("Induction Stove", 4, 3500, "Prestige", "Portable", 1);

        Collection<Appliances> appliancesCollection=new ArrayList<>();
        appliancesCollection.add(a1);
        appliancesCollection.add(a2);
        appliancesCollection.add(a3);
        appliancesCollection.add(a4);
        appliancesCollection.add(a5);

        return appliancesCollection;
    }
}
