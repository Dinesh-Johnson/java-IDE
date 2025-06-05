package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Doctor;
import com.xworkz.assoication.things.Patient;

public class PatientRunner {
    public static void main(String[] args) {

        Patient p1= new Patient("Dinesh");
        Patient p2=new Patient("Vinodha");
        Patient p3=new Patient("Aishwarya");

        Patient[] patient=new Patient[3];
        patient[0]=p1;
        patient[1]=p2;
        patient[2]=p3;
        Doctor doctor = new Doctor("Dr.Amulya", patient, 3);

        doctor.showPatients();
    }
}
