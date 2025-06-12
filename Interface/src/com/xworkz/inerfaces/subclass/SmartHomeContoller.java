package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.SmartApplianceManager;
import com.xworkz.inerfaces.state.ApplianceState;

public class SmartHomeContoller implements SmartApplianceManager {

    ApplianceState[] appls = new ApplianceState[10];
    int index =0;
    @Override
    public boolean addAppliance(ApplianceState appl) {
        if (index < appls.length) {
            System.out.println("Appliance Added");
            appls[index] = appl;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public boolean getAppliance(int appNumber) {
        for (int i = 0; i < index; i++) {
            if (appls[i].appNumber==appNumber){
                System.out.println("Getting Appliance :"+appls[i]);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateAppliance(int appNumber,ApplianceState newAppl) {
        for (int i = 0; i < index; i++) {
            if (appls[i].appNumber==appNumber){
                appls[i]=newAppl;
                System.out.println("Updated Appliances :"+newAppl);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAppliance(String applianceName) {
        for (int i = 0; i < index; i++) {
            if (appls[i].appliances==applianceName){
                appls[i]=null;
                System.out.println("Appliances Removed");
                return true;
            }
        }
        return false;
    }
}
