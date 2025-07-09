package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.Hospital;
import com.xworkz.inerfaces.state.Patient;

public class Clinic implements Hospital {

    Patient[] patients = new Patient[10];
    int index = 0;

    public void addPatient(Patient p) {
        if (index < patients.length) {
            patients[index] = p;
            index++;
        }
    }

    public void viewAllPatients() {
        for (int i = 0; i < index; i++) {
            if (patients[i] != null) {
                System.out.println(patients[i]);
            }
        }
    }

    public void updatePatientById(int id, Patient newData) {
        for (int i = 0; i < index; i++) {
            if (patients[i].id == id) {
                patients[i].name = newData.name;
                patients[i].disease = newData.disease;
            }
        }
    }

    public void deletePatientById(int id) {
        for (int i = 0; i < index; i++) {
            if (patients[i].id == id) {
                patients[i] = null;
            }
        }
    }
}
