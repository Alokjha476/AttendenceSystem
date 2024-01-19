package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.EmployeeSecDto;
import com.onlineattendance.system.entities.Admin;
import com.onlineattendance.system.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public Admin addEmployee(EmployeeSecDto employeeSecDto){
        Admin admin = new Admin();
        admin.setUsername(employeeSecDto.getUsername1());
        admin.setPassword(employeeSecDto.getPassword1());
        System.out.println(admin);
        return adminRepository.save(admin);
    }
    public List<Admin> ShowEmployeeWithDetails(){
        return adminRepository.findAll();
    }

}
