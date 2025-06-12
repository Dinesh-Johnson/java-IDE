package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.state.ApplianceState;
import com.xworkz.inerfaces.subclass.SmartHomeContoller;

public class AppliancesRunner {
    public static void main(String[] args) {

        ApplianceState appliance1=new ApplianceState();
        appliance1.appNumber=1;
        appliance1.appliances="Fan";

        ApplianceState appliance2=new ApplianceState();
        appliance2.appNumber=2;
        appliance2.appliances="AC";

        ApplianceState appliance3=new ApplianceState();
        appliance3.appNumber=3;
        appliance3.appliances="Light";


        SmartHomeContoller smartHomeContoller=new SmartHomeContoller();
        smartHomeContoller.addAppliance(appliance1);
        smartHomeContoller.addAppliance(appliance2);
        smartHomeContoller.addAppliance(appliance3);
        System.out.println("----------------");
        smartHomeContoller.getAppliance(3);
        System.out.println("----------------");
        smartHomeContoller.updateAppliance(2,appliance2);
        System.out.println("----------------");
        smartHomeContoller.removeAppliance("Fan");
        System.out.println();
    }
}
