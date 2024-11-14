package org.hospital.crm.repository;

import org.hospital.crm.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
}
