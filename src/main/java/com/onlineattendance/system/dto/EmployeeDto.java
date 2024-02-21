package com.onlineattendance.system.dto;

import com.onlineattendance.system.enums.EmployeeBranchEnum;
import lombok.Data;

@Data
public class EmployeeDto {
    private Integer empId;
    private String empName;
    private String empDept;
    private String empAddress;
    private String empPhone;
    private String empEmail;
  //  private String Others;
  //  private EmployeeBranchEnum employeeBranchEnum;
}
