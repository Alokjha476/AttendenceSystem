package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private EmployeeRepository employeeRepository;


    // add employee
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmpDept(employeeDto.getEmpDept());
        employee = employeeRepository.saveAndFlush(employee);
        System.out.println(employee);

        return employee;
    }

    // get employee
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    // Find by Name
    public Optional<Employee> findByName(String empName){
        Optional<Employee> response = employeeRepository.findByName(empName);
        if (response.isPresent()){
            Employee employee = response.get();
        }
        return  employeeRepository.findByName(empName);



    }


    // Update employee
//    public Employee updateEmployee(EmployeeDto employeeDto) {
//    Optional<Employee> response =findById(employeeDto.getEmpId());
//    if (response.isPresent()){
//    Employee employee = response.get();
//    }
//
//
//    }

}
