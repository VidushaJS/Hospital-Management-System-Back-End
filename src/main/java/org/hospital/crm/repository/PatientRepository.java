package org.hospital.crm.repository;

import org.hospital.crm.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

    List<PatientEntity> findByName(String name);

    PatientEntity findByNic(String nic);

    List<PatientEntity> findByContact(String contact);
}
