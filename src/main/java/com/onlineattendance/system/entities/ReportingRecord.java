package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ReportingRecord {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @ManyToOne
    private Employee reportingTo;
    @ManyToOne
    private Employee reportingFrom;


}
