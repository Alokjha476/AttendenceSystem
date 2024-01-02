package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data

public class Role {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    /**
     * Manager, Consultant, HR, Trainer, VP, SSE, SDE etc
     */
    private String roleName;






}
