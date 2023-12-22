package com.onlineattendance.system.repositories;

import com.onlineattendance.system.entities.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves,Integer> {

}
