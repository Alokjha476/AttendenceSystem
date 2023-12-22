package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer depId;
    private String depName;



}
