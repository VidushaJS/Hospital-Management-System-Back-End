package org.hospital.crm.service;

import org.hospital.crm.model.Appointment;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentService {
    void addAppointment(Appointment appointment);

    void deleteById(Integer id);

    List<Appointment> getAll();

    Appointment getAppointmentById(Integer id);

    List<Appointment> getAppointmentsByDoctorId(Integer id);

    List<Appointment> getAppointmentsByPatientId(Integer id);

    List<Appointment> getAppointmentsByDateTime(LocalDateTime dateTime);
}
