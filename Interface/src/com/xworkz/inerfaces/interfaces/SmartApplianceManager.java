package com.xworkz.inerfaces.interfaces;

import com.xworkz.inerfaces.state.ApplianceState;

public interface SmartApplianceManager {

    public boolean addAppliance(ApplianceState appl);
    public boolean getAppliance(int appNumber);
    public boolean updateAppliance(int appNumber,ApplianceState newAppl);
    public boolean removeAppliance(String applianceName );
}
