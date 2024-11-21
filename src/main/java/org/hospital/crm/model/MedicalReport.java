package org.hospital.crm.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MedicalReport {

    private Integer id;
    private String category;
    private LocalDateTime dateTime;
    private Integer patientId;
    private Integer doctorId;
    private Integer labNumber;
    private String pdfSource;
}
