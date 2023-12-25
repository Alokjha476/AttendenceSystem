package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.service.AdminService;
import jdk.javadoc.doclet.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    public AdminService adminService;

    @PostMapping("/employee") // for add
    public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employees = adminService.addEmployee(employeeDto);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/employee") // find by Id
    public ResponseEntity<Object> findById(@RequestParam Integer id){
        Optional<Employee> employees = adminService.findById(id);
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }
    @GetMapping("/employee/all")// find all employ ee
    public ResponseEntity<Object> findAllEmp(){
        List<Employee> employees = adminService.findAllEmployee();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }
//    @GetMapping("/employeeByName")
//    public ResponseEntity<Object> findByName(@RequestParam String empName){
//        Optional<Employee> employees = adminService.findByName(empName);
//        return  new ResponseEntity<>(employees,HttpStatus.OK);
//    }
    @PutMapping("/employee")
    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee =adminService.updateEmployee(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.OK);


    }

}
