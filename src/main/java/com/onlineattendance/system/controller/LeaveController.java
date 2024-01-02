package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.LeaveDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.EmployeeLeave;
import com.onlineattendance.system.service.EmployeeService;
import com.onlineattendance.system.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/leaves")
    public ResponseEntity<Object> applyLeave(@RequestBody LeaveDto leaveDto, @RequestParam Integer empId) {
        Optional<Employee> employeeOps = employeeService.findById(empId);
        if (employeeOps.isPresent()) {
            Employee employee = employeeOps.get();
            EmployeeLeave employeeLeave = leaveService.addLeaves(leaveDto, employee);
            return new ResponseEntity<>(employeeLeave, HttpStatus.OK);
        }
        return new ResponseEntity<>("Employee not Present :", HttpStatus.BAD_REQUEST);
    }
}
