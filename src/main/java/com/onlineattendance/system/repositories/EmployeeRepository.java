package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
