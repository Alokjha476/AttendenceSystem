package com.onlineattendance.system.controller;

import com.onlineattendance.system.enums.EmployeeBranch;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enum-mapping")
public class EmployeeBranchController {
    @GetMapping("/get")
    public String getByLevel(@RequestParam(required = false) EmployeeBranch employeeBranch) {
        System.out.println("Branch Saved");
        return employeeBranch.name();

    }

}
