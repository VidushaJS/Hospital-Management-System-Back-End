package org.hospital.crm.controller;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.model.Patient;
import org.hospital.crm.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/search/id/{id}")
    public Patient getPatientsByName(@PathVariable Integer id) {
        return service.getPatientByID(id);
    }

    @GetMapping("/search/name/{name}")
    public List<Patient> getPatientsByName(@PathVariable String name) {
        return service.getPatientsByName(name);
    }

    @GetMapping("/search/nic/{nic}")
    public Patient getPatientByNIC(@PathVariable String nic) {
        return service.getPatientsByNIC(nic);
    }

    @GetMapping("/search/contact/{contact}")
    public List<Patient> getPatientsByContact(@PathVariable String contact) {
        return service.getPatientsByContact(contact);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody Patient patient) {
        service.addPatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePatient(@RequestBody Patient patient) {
        service.addPatient(patient);
    }
}
