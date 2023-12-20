package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Leaves {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer leaveId;
    private String days;
    private String reason;
    @ManyToOne
    private Employee employee;

}
