package com.xworkz.assoication.runner;

import com.xworkz.assoication.hospital.Hospital;
import com.xworkz.assoication.hospital.MedicalRecord;
import com.xworkz.assoication.hospital.Patient;
import com.xworkz.assoication.hospital.Ward;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Ward general = new Ward("General Ward");
        Ward icu = new Ward("ICU");

        Patient p1 = new Patient("Anita");
        p1.assignRecord(new MedicalRecord("Fever", "Paracetamol"));

        Patient p2 = new Patient("Rahul");
        p2.assignRecord(new MedicalRecord("Injury", "Bandage"));

        Patient p3 = new Patient("Sneha");
        p3.assignRecord(new MedicalRecord("Asthma", "Inhaler"));

        general.addPatient(p1);
        general.addPatient(p2);
        icu.addPatient(p3);

        hospital.addWard(general);
        hospital.addWard(icu);

        hospital.showAllMedicalRecords();
    }
}
