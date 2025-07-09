package com.xworkz.assoication.hospital;

public class Hospital {
    String name;
    Ward[] wards = new Ward[5];
    int wardCount = 0;

    public Hospital(String name) {
        this.name = name;
    }

    public void addWard(Ward ward) {
        wards[wardCount++] = ward;
    }

    public void showAllMedicalRecords() {
        System.out.println("Hospital: " + name);
        for (int i = 0; i < wardCount; i++) {
            wards[i].showAllRecords();
        }
    }
}
