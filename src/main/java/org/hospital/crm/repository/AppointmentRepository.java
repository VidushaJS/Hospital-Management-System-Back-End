package org.hospital.crm.repository;

import org.hospital.crm.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

    List<AppointmentEntity> findByAdminId(Integer doctorId);
    List<AppointmentEntity> findByPatientId(Integer patientId);
    List<AppointmentEntity> findByDateTime(LocalDateTime dateTime);
}
