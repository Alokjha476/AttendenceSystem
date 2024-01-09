package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class LeaveType {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer leaveId;
    private String casualLeave;
    private String sickLeave;
    @ManyToOne
    private EmployeeLeave employeeLeave;

}
