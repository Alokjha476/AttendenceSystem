package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendenceRepository extends JpaRepository<Attendance, Integer> {
}
