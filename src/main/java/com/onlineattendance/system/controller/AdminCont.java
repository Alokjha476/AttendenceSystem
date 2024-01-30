package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.EmployeeSecDto;
import com.onlineattendance.system.entities.Admin;
import com.onlineattendance.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCont {
    @Autowired
    private AdminService adminService;
    @PostMapping("/Add-Employee")
     public ResponseEntity<Object> addEmployee(EmployeeSecDto employeeSecDto){
         Admin admin = adminService.addEmployee(employeeSecDto);
         return new ResponseEntity<>(admin, HttpStatus.OK);
     }
}