package com.onlineattendance.system.dto;

import com.onlineattendance.system.enums.LeaveStatusEnum;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveDto {
    private Integer leaveId;
    private String reason;
    /**
     * leave type - SICK, ANNUAL, EARNED, CASUAL
     */

    private  String leaveType;

    /**
     * leave status - approved, denied, pending
     */
    private LeaveStatusEnum leaveStatus;
    private String remark;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Boolean isHalfDay;
}
