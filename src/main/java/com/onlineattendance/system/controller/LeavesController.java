package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.LeavesDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.Leaves;
import com.onlineattendance.system.service.EmployeeService;
import com.onlineattendance.system.service.LeavesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LeavesController {
    @Autowired
    private LeavesService leavesService;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/leaves")
    public ResponseEntity<Object> addLeaves(LeavesDto leavesDto, @RequestParam Integer empId) {
        Optional<Employee> employeeOps = employeeService.findById(empId);
        if (employeeOps.isPresent()) {
            Employee employee = employeeOps.get();
            Leaves leaves = leavesService.addLeaves(leavesDto, employee);
            return new ResponseEntity<>(employeeOps, HttpStatus.OK);
        }
        return new ResponseEntity<>("Employee not Present :", HttpStatus.BAD_REQUEST);
    }
}
