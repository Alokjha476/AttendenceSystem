package com.onlineattendance.system.controller;

import com.onlineattendance.system.enums.LeaveTypeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LeaveTypeEnumCont {
@GetMapping("leave_type")
    public String getByLevel(@RequestParam(required = false) LeaveTypeEnum leaveTypeEnum) {
        return leaveTypeEnum.name();

    }

}
