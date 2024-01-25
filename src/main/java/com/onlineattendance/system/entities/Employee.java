package com.onlineattendance.system.entities;

import com.onlineattendance.system.enums.EmployeeBranch;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String empName;
    private String empDept;
    private String empAddress;
    private String empPhone;
    private String empEmail;
    private String Others;

    @Enumerated(value = EnumType.STRING)
    private EmployeeBranch employeeBranch;
   // @OneToOne
   // private Roles roles;


}
