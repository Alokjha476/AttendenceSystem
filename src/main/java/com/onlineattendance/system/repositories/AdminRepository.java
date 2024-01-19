package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Admin;
import com.onlineattendance.system.entities.EmployeeSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    Admin save(EmployeeSecurity employeeSecurity);
}
