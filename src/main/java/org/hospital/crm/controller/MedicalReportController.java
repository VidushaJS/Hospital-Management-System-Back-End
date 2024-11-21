package org.hospital.crm.controller;

import lombok.RequiredArgsConstructor;
import org.hospital.crm.model.MedicalReport;
import org.hospital.crm.service.MedicalReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medreport")
@RequiredArgsConstructor
public class MedicalReportController {

    private final MedicalReportService service;

    @PostMapping("/add")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport) {
        service.addMedicalReport(medicalReport);
    }

    @GetMapping("/all")
    public List<MedicalReport> getAllMedicalReports() {
        return service.getAllMedicalReports();
    }
}
