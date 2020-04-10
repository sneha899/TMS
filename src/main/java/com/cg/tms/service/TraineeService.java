package com.cg.tms.service;

import java.util.List;


import com.cg.tms.entity.Trainee;
import com.cg.tms.exception.TraineeException;

public interface TraineeService {

	public Trainee  findAllTraineeId(int traineeId) throws TraineeException;
	
	public Trainee createTrainee(Trainee trainee);
	
	public List<Trainee>  findAllTrainees() throws TraineeException;
	
	public Trainee deleteTraineeById(int traineeId) throws TraineeException;

}
