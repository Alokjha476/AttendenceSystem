package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.RoleDto;
import com.onlineattendance.system.entities.Role;
import com.onlineattendance.system.service.EmployeeService;
import com.onlineattendance.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/roll")
    public ResponseEntity<Object> addRole(@RequestBody RoleDto roleDto) {
        Role role = roleService.AddRole(roleDto);
        return new ResponseEntity<Object>(role, HttpStatus.OK);
    }

    @GetMapping("/employee/roll")
    public ResponseEntity<Object> findRole() {
        List<Role> roles = roleService.findAllRoles();
        System.out.println(roles);
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @GetMapping("/employee/role")
    public ResponseEntity<Object> findById(@RequestParam Integer id) {
        Optional<Role> role = roleService.findById(id);
        System.out.println(role);
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}
