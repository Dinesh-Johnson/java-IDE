package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.subclass.Clinic;
import com.xworkz.inerfaces.state.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        clinic.addPatient(new Patient(1, "Vinodha", "Fever"));
        clinic.addPatient(new Patient(2, "Aishwarya", "Cold"));
        clinic.addPatient(new Patient(3, "Dinesh", "Allergy"));

        System.out.println("All Patients:");
        clinic.viewAllPatients();

        clinic.updatePatientById(2, new Patient(2, "Aishwarya", "Flu"));
        System.out.println("After Update");
        clinic.viewAllPatients();

        clinic.deletePatientById(1);
        System.out.println("After Deletion");
        clinic.viewAllPatients();
    }
}
