package com.onlineattendance.system.dto;

import com.onlineattendance.system.enums.EmployeeBranchEnum;
import lombok.Data;

@Data
public class EmployeeResponseDto {
    private String empName;
    private String empDept;
    private String empAddress;
    private String empPhone;
    private EmployeeBranchEnum employeeBranchEnum;

}
