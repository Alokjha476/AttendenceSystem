package com.onlineattendance.system.entities;

import com.onlineattendance.system.enums.LeaveStatusNum;
import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.LifecycleState;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer leaveId;
    /**
     * leave type - SICK, ANNUAL, EARNED, CASUAL
     */
    @OneToMany
    private List<LeaveType> leaveTypes;

    private Integer timeDuration;
    private String reason;
    /**
     * leave status - approved, denied, pending
     */
    @Enumerated(value = EnumType.STRING)
    private LeaveStatusNum leaveStatus;
    private String remark;
    private LocalDate fromDate;
    private LocalDate toDate;
    @ManyToOne
    private Employee employee;
    @CreationTimestamp
    private Timestamp createdDate;
    @LastModifiedDate
    private Timestamp updatedDate;


}
