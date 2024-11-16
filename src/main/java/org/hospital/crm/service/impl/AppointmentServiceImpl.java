package org.hospital.crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.entity.AppointmentEntity;
import org.hospital.crm.model.Appointment;
import org.hospital.crm.repository.AppointmentRepository;
import org.hospital.crm.service.AppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addAppointment(Appointment appointment) {
        repository.save(mapper.map(appointment, AppointmentEntity.class));
    }
}
