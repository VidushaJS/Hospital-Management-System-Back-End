package org.hospital.crm.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {

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
