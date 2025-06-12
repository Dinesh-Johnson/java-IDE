package com.xworkz.inerfaces.interfaces;

import com.xworkz.inerfaces.state.Patient;

public interface Hospital {

    void addPatient(Patient p);
    void viewAllPatients();
    void updatePatientById(int id,Patient newData);
    void deletePatientById(int id);
}
