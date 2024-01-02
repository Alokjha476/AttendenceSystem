package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
