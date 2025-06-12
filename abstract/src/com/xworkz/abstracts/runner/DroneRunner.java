package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.child.MedicalDrone;

public class DroneRunner {
    public static void main(String[] args) {
        MedicalDrone ruralDrone=new MedicalDrone();
        System.out.println("Rural Drone");
        ruralDrone.displaySpec();

        System.out.println();

        MedicalDrone medicalDrone=new MedicalDrone(true);
        System.out.println("Medical Drone");
        medicalDrone.displaySpec();
    }
}
