package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.RoleDto;
import com.onlineattendance.system.entities.Role;
import com.onlineattendance.system.service.EmployeeService;
import com.onlineattendance.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/roll")
    private ResponseEntity<Object> addRole(@RequestBody RoleDto roleDto){
        Role role = roleService.AddRole(roleDto);
        return new ResponseEntity<Object>(role, HttpStatus.OK);
    }
    @GetMapping("/employee/roll")
    private ResponseEntity<Object> getRole(){
        List<Role> roles = roleService.findAllRoles();
        System.out.println(roles);
        return new ResponseEntity<>(roles,HttpStatus.OK);
    }

}
