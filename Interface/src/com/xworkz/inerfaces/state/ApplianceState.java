package com.xworkz.inerfaces.state;

public class ApplianceState {

    public int appNumber;
    public String appliances;

    @Override
    public String toString() {
        return "ApplianceState{" +
                "appNumber=" + appNumber +
                ", appliances='" + appliances + '\'' +
                '}';
    }
}
