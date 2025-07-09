package com.xworz.method.chaining;

public class Hospital {
    public Hospital() {
        this("General");
        System.out.println("Default hospital");
        System.out.println();
    }

    public Hospital(String type) {
        System.out.println("Hospital type: " + type);
        System.out.println();
    }

    public void admit() {
        treat("Operation");
        System.out.println("Patient admitted...");
        System.out.println();
    }

    public void treat(String type) {
        System.out.println("Treating patient :"+type);
        generateBill(90000.00);
        System.out.println();
    }

    public static void generateBill(double cost) {
        System.out.println("Generating bill...");
        System.out.println("Total Payable Amount is :"+cost);
        discharge(20);
        System.out.println();
    }

    public static void discharge(int days) {
        System.out.println("Discharge confirmed :"+days+"-days");
    }
}
