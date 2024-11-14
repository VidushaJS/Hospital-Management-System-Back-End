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
}
