package org.hospital.crm.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appointment {

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
