package org.hospital.crm.service;

import org.hospital.crm.model.Patient;

import java.util.List;

public interface PatientService {

    void addPatient(Patient patient);

    List<Patient> getAllPatients();

    void deleteById(Integer id);

    List<Patient> getPatientsByName(String name);

    Patient getPatientByID(Integer id);

    Patient getPatientsByNIC(String nic);

    List<Patient> getPatientsByContact(String contact);
}
