package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findById(Integer id);

    @Query(value = "select e from Employee e where e.empName =:empName")
    Optional<Employee> findByName(String empName);
}
