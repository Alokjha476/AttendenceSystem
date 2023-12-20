package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Department {
    private String managementDep;
    private String technicalDep;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer depId;
    private String depName;
    @OneToOne
    private Employee employee;


}