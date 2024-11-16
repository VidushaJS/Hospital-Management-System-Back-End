package org.hospital.crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.entity.PatientEntity;
import org.hospital.crm.model.Patient;
import org.hospital.crm.repository.PatientRepository;
import org.hospital.crm.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        repository.findAll().forEach(patientEntity -> patients.add(mapper.map(patientEntity, Patient.class)));
        return patients;
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Patient> getPatientsByName(String name) {
        List<Patient> patients = new ArrayList<>();
        repository.findByName(name).forEach(patientEntity -> patients.add(mapper.map(patientEntity, Patient.class)));
        return patients;
    }

    @Override
    public Patient getPatientByID(Integer id) {
        return mapper.map(repository.findById(id).get(), Patient.class);
    }

    @Override
    public Patient getPatientsByNIC(String nic) {
        return mapper.map(repository.findByNic(nic), Patient.class);
    }

    @Override
    public List<Patient> getPatientsByContact(String contact) {
        List<Patient> patients = new ArrayList<>();
        repository.findByContact(contact).forEach(patientEntity -> patients.add(mapper.map(patientEntity, Patient.class)));
        return patients;
    }

}
