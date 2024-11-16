package org.hospital.crm.controller;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.model.Appointment;
import org.hospital.crm.service.AppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService service;

    @PostMapping("/add")
    public void addAppointment(@RequestBody Appointment appointment) {
        service.addAppointment(appointment);
    }
}
