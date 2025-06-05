package com.xworkz.assoication.things;

public class Doctor {
    String name;
    Patient[] patients;
     int count=0;

    public Doctor(String name, Patient[] patients, int count) {
        this.name = name;
        this.patients = patients;
        this.count = count;
    }

    public void showPatients(){
        System.out.println("Doctor name :"+name);
        System.out.println("...The patients are...");
        for (int i = 0; i < count; i++) {
            System.out.println(" -"+patients[i].name);

        }
    }
}
