package com.onlineattendance.system.dto;

import com.onlineattendance.system.entities.Leaves;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDto {
    private Integer empId;
    private String empName;
    private String empDept;
    private String empAddress;
    private String empPhone;
    private String empEmail;
    private String Others;
    private List<LeavesDto> leavesDtos;
    private List<AttendenceDto> attendenceDtos;
    private  List<DepartmentDto> departmentDtos;

}
