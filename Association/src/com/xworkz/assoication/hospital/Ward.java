package com.xworkz.assoication.hospital;

public class Ward {
    String name;
    Patient[] patients = new Patient[5];
    int patientCount = 0;

    public Ward(String name) {
        this.name = name;
    }

    public void addPatient(Patient p) {
        patients[patientCount] = p;
        patientCount++;
    }

    public void showAllRecords() {
        System.out.println("Ward: " + name);
        for (int i = 0; i < patientCount; i++) {
            patients[i].showRecord();
        }
    }
}
