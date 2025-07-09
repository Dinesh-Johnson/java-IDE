package com.xworkz.assoication.runner;

import com.xworkz.assoication.software.Feature;
import com.xworkz.assoication.software.Product;
import com.xworkz.assoication.software.SoftwareCompany;
import com.xworkz.assoication.software.Version;

public class SoftwareRunner {
    public static void main(String[] args) {
        SoftwareCompany tcs = new SoftwareCompany("TCS");

        Product app1 = new Product("PayrollApp");
        Version v1 = new Version("v1.0");
        v1.addFeature(new Feature("Login System"));
        v1.addFeature(new Feature("Payslip Generator"));

        Version v2 = new Version("v2.0");
        v2.addFeature(new Feature("Leave Tracker"));
        v2.addFeature(new Feature("Overtime Calculator"));

        app1.addVersion(v1);
        app1.addVersion(v2);
        System.out.println();

        tcs.addProduct(app1);
        System.out.println();

        tcs.showAllProductFeatures();
    }
}
