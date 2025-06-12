package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.DepartmentalStore;
import com.xworkz.inerfaces.interfaces.House;

public class BuildingImpl implements House, DepartmentalStore {


    @Override
    public void makeAbluePrint() {
        System.out.println("Making BluePrint");
    }

    @Override
    public void approval() {
        System.out.println("Approval is Bending");
    }
}
