package com.onlineattendance.system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.apache.tomcat.util.net.openssl.ciphers.Encryption;

@Data
@Entity
public class Admin {
    @GeneratedValue (strategy =  GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String username;

    private String password;


}
