package org.hospital.crm.service;

import org.hospital.crm.model.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addMedicalReport(MedicalReport medicalReport);

    List<MedicalReport> getAllMedicalReports();
}
