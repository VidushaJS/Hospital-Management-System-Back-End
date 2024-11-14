package org.hospital.crm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "patient")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nic;
    private String age;
    private String gender;
    private String contact;
    private String address;
    private String category;
    private String bloodGroup;
    private String allergies;
    private String note;
}
