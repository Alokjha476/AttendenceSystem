package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    // add employee
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmpName(employeeDto.getEmpName());
       // employee.setEmployeeBranchEnum(employeeDto.getEmployeeBranchEnum());
        employee.setEmpDept(employeeDto.getEmpDept());
        employee.setEmpPhone(employeeDto.getEmpPhone());
        employee.setEmpEmail(employeeDto.getEmpEmail());
        employee.setEmpAddress(employeeDto.getEmpAddress());
        //  employee.setOthers(employeeDto.getOthers());
        System.out.println("Employee Added Successfully:");
        return employeeRepository.save(employee);


    }

    // get employee
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }


    //Update employee
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Optional<Employee> response = findById(employeeDto.getEmpId());
        if (response.isPresent()) {
            Employee employee = response.get();
            employee.setEmpName(employeeDto.getEmpName());
            employee.setEmployeeBranchEnum(employeeDto.getEmployeeBranchEnum());
            employee.setEmpDept(employeeDto.getEmpDept());
            employee.setEmpPhone(employeeDto.getEmpPhone());
            employee.setEmpEmail(employeeDto.getEmpEmail());
            employee.setEmpAddress(employeeDto.getEmpAddress());
            System.out.println("Employee Updated Successfully:");
            return employeeRepository.save(employee);
        }
        return null;
    }

    public Optional<Employee> findByName(String empName) {
        return employeeRepository.findByName(empName);


    }
}
