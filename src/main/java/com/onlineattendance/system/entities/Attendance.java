package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer aId;
    private String attend;
    private String absent;
    @ManyToOne
    private Employee employee;


}
