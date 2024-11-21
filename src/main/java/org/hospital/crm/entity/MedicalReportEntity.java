package org.hospital.crm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "medical_report")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MedicalReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private LocalDateTime dateTime;
    private Integer patientId;
    private Integer doctorId;
    private Integer labNumber;
    private String pdfSource;
}
