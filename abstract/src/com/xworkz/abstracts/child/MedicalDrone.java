package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.DeliveryDrone;

public class MedicalDrone extends DeliveryDrone {


    public MedicalDrone() {
        super(800,15.0);
    }

    public MedicalDrone(boolean isUrban) {
        super(250, 8.0);
    }

    @Override
    public void displaySpec() {
        System.out.println("Altitude Range: " + altitudeRange + " meters");
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
