package com.onlineattendance.system.entities;

import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
@Data
public class Roles {
    private Integer id;

    /**
     * Manager, Consultant, HR, Trainer, VP, SSE, SDE etc
     */
    private String roleName;



}
