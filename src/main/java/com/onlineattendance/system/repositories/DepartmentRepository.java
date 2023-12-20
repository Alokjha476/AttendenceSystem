package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
