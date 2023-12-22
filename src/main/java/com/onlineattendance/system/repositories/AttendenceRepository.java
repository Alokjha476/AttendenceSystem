package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendance, Integer> {
}
