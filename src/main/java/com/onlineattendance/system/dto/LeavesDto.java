package com.onlineattendance.system.dto;

import lombok.Data;

@Data
public class LeavesDto {
    private Integer leaveId;
    private String days;
    private String reason;
}
