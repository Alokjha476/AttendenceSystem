package com.onlineattendance.system.controller;


import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.enums.EmployeeBranch;
import com.onlineattendance.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/employee") // for add
    public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employees = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee") // find by ID
    public ResponseEntity<Object> findById(@RequestParam Integer id) {
        Optional<Employee> employees = employeeService.findById(id);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/all")// find all employ ee
    public ResponseEntity<Object> findAllEmp() {
        List<Employee> employees = employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    //    @GetMapping("/employeeByName")
//    public ResponseEntity<Object> findByName(@RequestParam String empName){
//        Optional<Employee> employees = adminService.findByName(empName);
//        return  new ResponseEntity<>(employees,HttpStatus.OK);
//    }
    @PutMapping("/employee")
    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeService.updateEmployee(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/employeeByName")
    public ResponseEntity<Object> findByName(@RequestParam String empName) {
        Optional<Employee> employee = employeeService.findByName(empName);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<>("Employee does not exist:", HttpStatus.OK);
     }
}

