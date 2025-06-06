package com.xworkz.assoication.hospital;

public class MedicalRecord {
    String illness;
    String treatment;

    public MedicalRecord(String illness, String treatment) {
        this.illness = illness;
        this.treatment = treatment;
    }

    public String toString() {
        return "Illness: " + illness + ", Treatment: " + treatment;
    }
}
