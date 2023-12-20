package com.onlineattendance.system.dto;

import lombok.Data;

@Data
public class DepartmentDto {
    private String managementDep;
    private String technicalDep;
    private Integer depId;
    private String depName;
}
