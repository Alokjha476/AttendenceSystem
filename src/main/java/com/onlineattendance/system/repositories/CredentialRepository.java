package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {
    Credential findByUsername(String username);



}
