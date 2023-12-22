package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String userName;
    private String password;
    private String role;

}
