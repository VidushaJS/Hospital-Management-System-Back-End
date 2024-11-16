package org.hospital.crm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointment")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private LocalDateTime dateTime;
    private Integer roomNumber;
    private Integer queueNumber;
    private String description;
    private String status;
    private String qr;

    private Integer patientId;
    private Integer adminId;
}
