package com.onlineattendance.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeavesDto {
    private Integer leaveId;
    private String days;
    private String reason;
    private String startDate;
    private String lastDate;
    private String approve;
    private String notApprove;
    private String remark;
}
