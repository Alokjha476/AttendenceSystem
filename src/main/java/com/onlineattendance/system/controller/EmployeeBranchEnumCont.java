package com.onlineattendance.system.controller;

import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.enums.EmployeeBranchEnum;
import com.onlineattendance.system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enum-mapping")
public class EmployeeBranchEnumCont {
    @Autowired
    private EmployeeService employeeService;


//    @GetMapping("/get")
//    public String getByLevel(@RequestParam(required = false) EmployeeBranchEnum
//                                         employeeBranchEnum, EmployeeDto employeeDto) {
//
//        System.out.println("Branch mapping running :");
//        return employeeBranchEnum.name();
//    }
   @GetMapping
    public ResponseEntity<Object> getByBranch(@RequestParam(required = false)
                                              EmployeeBranchEnum employeeBranchEnum){
       System.out.println("Branch code Running: ");
       return new ResponseEntity<>(employeeBranchEnum, HttpStatus.OK);

   }


    }


