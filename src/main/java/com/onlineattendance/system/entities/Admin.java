package com.onlineattendance.system.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {
    @GeneratedValue (strategy =  GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String username;
    private String password;


}
