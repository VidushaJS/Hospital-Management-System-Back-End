package org.hospital.crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.entity.AppointmentEntity;
import org.hospital.crm.model.Appointment;
import org.hospital.crm.repository.AppointmentRepository;
import org.hospital.crm.service.AppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addAppointment(Appointment appointment) {
        repository.save(mapper.map(appointment, AppointmentEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Appointment> getAll() {
        List<Appointment> appointments = new ArrayList<>();
        repository.findAll().forEach(entity -> appointments.add(mapper.map(entity, Appointment.class)));
        return appointments;
    }

    @Override
    public Appointment getAppointmentById(Integer id) {
        return mapper.map(repository.findById(id), Appointment.class);
    }

    @Override
    public List<Appointment> getAppointmentsByDoctorId(Integer id) {
        List<Appointment> appointments = new ArrayList<>();
        repository.findByAdminId(id).forEach(entity -> appointments.add(mapper.map(entity, Appointment.class)));
        return appointments;
    }

    @Override
    public List<Appointment> getAppointmentsByPatientId(Integer id) {
        List<Appointment> appointments = new ArrayList<>();
        repository.findByPatientId(id).forEach(entity -> appointments.add(mapper.map(entity, Appointment.class)));
        return appointments;
    }

    @Override
    public List<Appointment> getAppointmentsByDateTime(LocalDateTime dateTime) {
        List<Appointment> appointments = new ArrayList<>();
        repository.findByDateTime(dateTime).forEach(entity -> appointments.add(mapper.map(entity, Appointment.class)));
        return appointments;
    }
}
