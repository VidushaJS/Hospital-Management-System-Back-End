package org.hospital.crm.repository;

import org.hospital.crm.entity.MedicalReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity, Integer> {
}
