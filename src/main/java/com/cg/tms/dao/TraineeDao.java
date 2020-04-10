package com.cg.tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.tms.entity.Trainee;
@Repository
public interface TraineeDao extends JpaRepository<Trainee,Integer>{
	
	
}
