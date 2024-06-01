package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.AdminDto;
import com.onlineattendance.system.dto.EmployeeSecDto;
import com.onlineattendance.system.entities.Admin;
import com.onlineattendance.system.entities.Credential;
import com.onlineattendance.system.service.AdminService;
import com.onlineattendance.system.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminCont {
    @Autowired
    private AdminService adminService;

    @Autowired
    private CredentialService credentialService;
    @PostMapping("/Add-Employee")
     public ResponseEntity<Object> addEmployee(EmployeeSecDto employeeSecDto){
         Admin admin = adminService.addEmployee(employeeSecDto);
         return new ResponseEntity<>(admin, HttpStatus.OK);
     }

     @PostMapping("/register")
    public ResponseEntity<Object> registerAdmin(@RequestBody Credential credential) {
        Credential cred = credentialService.registerCredential(credential);
        return ResponseEntity.ok(cred);
     }
}