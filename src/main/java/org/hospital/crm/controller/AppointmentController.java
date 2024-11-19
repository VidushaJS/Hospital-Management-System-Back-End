package org.hospital.crm.controller;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.model.Appointment;
import org.hospital.crm.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppointment(@RequestBody Appointment appointment) {
        service.addAppointment(appointment);
    }

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        return service.getAll();
    }

    @GetMapping("/search/{id}")
    public Appointment getAppointmentById(@PathVariable Integer id) {
        return service.getAppointmentById(id);
    }

    @GetMapping("/search/doctor/{id}")
    public List<Appointment> getAppointmentsByDoctorId(@PathVariable Integer id) {
        return service.getAppointmentsByDoctorId(id);
    }

    @GetMapping("/search/patient/{id}")
    public List<Appointment> getAppointmentsByPatientId(@PathVariable Integer id) {
        return service.getAppointmentsByPatientId(id);
    }

    @GetMapping("/search/datetime/{dateTime}")
    public List<Appointment> getAppointmentsByDateTime(@PathVariable LocalDateTime dateTime) {
        return service.getAppointmentsByDateTime(dateTime);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppointment(@RequestBody Appointment appointment) {
        service.addAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAppointment(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
