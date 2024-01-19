package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.mapping.PrimaryKey;

import java.nio.charset.CharsetDecoder;

@Entity
@Data
public class EmployeeSecurity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @NotNull
    private Integer id;
    @NotNull
    private String username1;
    @NotNull
    private String password1;

}
