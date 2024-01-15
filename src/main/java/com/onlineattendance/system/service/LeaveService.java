package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.LeaveDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.EmployeeLeave;
import com.onlineattendance.system.repositories.LeavesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;

@Service
public class LeaveService {
    @Autowired
    private LeavesRepository leavesRepository;

    public EmployeeLeave addLeaves(LeaveDto leaveDto, Employee employee) {
        EmployeeLeave employeeLeave = new EmployeeLeave();
        /*try {
            ObjectMapper mapper = new ObjectMapper();
            String leaveStr = mapper.writeValueAsString(leaveDto);
            leave = mapper.readValue(leaveStr, Leave.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }*/
        employeeLeave.setLeaveTypes(leaveDto.getLeaveType());
        employeeLeave.setLeaveStatus(leaveDto.getLeaveStatus());
        employeeLeave.setReason(leaveDto.getReason());
        employeeLeave.setRemark(leaveDto.getRemark());
        employeeLeave.setToDate(leaveDto.getToDate());
        employeeLeave.setFromDate(leaveDto.getFromDate());
        int totalTime;
        if (leaveDto.getIsHalfDay() != null && leaveDto.getIsHalfDay()) {
            totalTime = 4;
        } else {
            Period period = Period.between(leaveDto.getFromDate(), leaveDto.getToDate());
            totalTime = 8 * (period.getDays() + 1);
        }

        employeeLeave.setTimeDuration(totalTime);

        employeeLeave.setEmployee(employee);
        return leavesRepository.save(employeeLeave);
    }
}
