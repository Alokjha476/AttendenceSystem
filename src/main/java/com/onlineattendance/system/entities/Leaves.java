package com.onlineattendance.system.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leaves {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer leaveId;
    private String days;
    private String reason;
    private String approve;
    private String notApprove;
    private String remark;
    @CreationTimestamp
    private String startDate;
    @LastModifiedDate
    private String lastDate;
    @ManyToOne
    private Employee employee;


}
