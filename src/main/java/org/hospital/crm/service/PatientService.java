package org.hospital.crm.service;

import org.hospital.crm.model.Patient;

import java.util.List;

public interface PatientService {

    void addPatient(Patient patient);

    List<Patient> getAllPatients();
}
