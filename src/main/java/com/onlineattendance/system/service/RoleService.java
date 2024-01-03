package com.onlineattendance.system.service;

import com.onlineattendance.system.dto.RoleDto;
import com.onlineattendance.system.entities.Employee;
import com.onlineattendance.system.entities.Role;
import com.onlineattendance.system.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role AddRole(RoleDto roleDto) {
        Role empRole = new Role();
        empRole.setRoleName(roleDto.getRoleName());
        return roleRepository.save(empRole);
    }

    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(Integer id) {
        return roleRepository.findById(id);
    }


}
