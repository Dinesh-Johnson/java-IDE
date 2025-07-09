package com.xworkz.assoication.hospital;

public class Patient {
    String name;
    MedicalRecord record;

    public Patient(String name) {
        this.name = name;
    }

    public void assignRecord(MedicalRecord record) {
        this.record = record;
    }

    public void showRecord() {
        System.out.println("Patient: " + name + " → " + record);
    }
}
