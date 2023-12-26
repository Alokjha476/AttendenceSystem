package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.LeavesDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.Leaves;
import com.onlineattendance.system.repositories.EmployeeRepository;
import com.onlineattendance.system.repositories.LeavesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeavesService {
    @Autowired
    private LeavesRepository leavesRepository;
    public Leaves addLeaves(LeavesDto leavesDto, Employee employee) {
        Leaves leaves = new Leaves();
        leaves.setEmployee(employee);
        leaves.setDays(leavesDto.getDays());
        leaves.setReason(leavesDto.getReason());
        leaves.setStartDate(leavesDto.getStartDate());
        leaves.setLastDate(leavesDto.getLastDate());
        return leavesRepository.save(leaves);
    }
}
