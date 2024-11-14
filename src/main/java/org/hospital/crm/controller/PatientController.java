package org.hospital.crm.controller;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.model.Patient;
import org.hospital.crm.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @PostMapping("/add")
    public void addPatient(@RequestBody Patient patient) {
        service.addPatient(patient);
    }
}
