package org.hospital.crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.entity.MedicalReportEntity;
import org.hospital.crm.model.MedicalReport;
import org.hospital.crm.repository.MedicalReportRepository;
import org.hospital.crm.service.MedicalReportService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {

    private final MedicalReportRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        repository.save(mapper.map(medicalReport, MedicalReportEntity.class));
    }

    @Override
    public List<MedicalReport> getAllMedicalReports() {
        List<MedicalReport> reports = new ArrayList<>();
        repository.findAll().forEach(entity -> reports.add(mapper.map(entity, MedicalReport.class)));
        return reports;
    }
}
