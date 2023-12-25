package com.onlineattendance.system.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Integer empId;
    private String empName;
    private String empDept;
    private String empAddress;
    private String empPhone;
    private String empEmail;
    private String Others;
}
