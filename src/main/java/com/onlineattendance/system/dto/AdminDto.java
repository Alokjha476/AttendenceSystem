package com.onlineattendance.system.dto;

import lombok.Data;

@Data
public class AdminDto {
    private Integer id;
    private String userName;
    private String password;
    private String role;
}
