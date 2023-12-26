package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.EmployeeDto;
import com.onlineattendance.system.dto.LeavesDto;
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
    @Autowired
    private LeavesService leavesService;

    // add employee
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmpDept(employeeDto.getEmpDept());
        employee.setEmpPhone(employeeDto.getEmpPhone());
        employee.setEmpEmail(employeeDto.getEmpEmail());
        employee.setEmpAddress(employeeDto.getEmpAddress());
        employee.setOthers(employeeDto.getOthers());
        employee = employeeRepository.save(employee);
        System.out.println(employee);
        if (employeeDto.getLeavesDtos() != null && !employeeDto.getLeavesDtos().isEmpty()) {
            for (LeavesDto add : employeeDto.getLeavesDtos()
            ) {
                leavesService.addLeaves(add, employee);
            }
        }
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
//    public Optional<Employee> findByName(String empName){
//        Optional<Employee> response = employeeRepository.findByName(empName);
//        if (response.isPresent()){
//            Employee employee = response.get();
//
//        }
//        return
//
//    }
    //Update employee
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Optional<Employee> response = findById(employeeDto.getEmpId());
        if (response.isPresent()) {
            Employee employee = response.get();
            if (employeeDto.getEmpName() != null && !employeeDto.getEmpName().isEmpty()) {
                employee.setEmpName(employeeDto.getEmpName());
            }
            if (employeeDto.getEmpDept() != null && !employeeDto.getEmpDept().isEmpty()) {
                employee.setEmpDept(employeeDto.getEmpDept());
            }
            if (employeeDto.getEmpPhone() != null && !employeeDto.getEmpPhone().isEmpty()) {
                employee.setEmpPhone(employeeDto.getEmpPhone());
            }
            if (employeeDto.getEmpEmail() != null && !employeeDto.getEmpEmail().isEmpty()) {
                employee.setEmpEmail(employeeDto.getEmpEmail());
            }
            if (employeeDto.getEmpAddress() != null && !employeeDto.getEmpAddress().isEmpty()) {
                employee.setEmpAddress(employeeDto.getEmpAddress());
            }
            if (employeeDto.getOthers() != null && !employeeDto.getOthers().isEmpty()) {
                employee.setOthers(employeeDto.getOthers());
            }
            return employeeRepository.save(employee);
        }
        System.out.println("Returned");
        return null;

    }
}
