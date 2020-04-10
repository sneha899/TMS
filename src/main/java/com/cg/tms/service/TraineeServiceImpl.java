package com.cg.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.dao.TraineeDao;
import com.cg.tms.entity.Trainee;
import com.cg.tms.exception.TraineeException;

@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao traineeDao;
	
	
	@Override
	public Trainee createTrainee(Trainee trainee) {
      Trainee tr=traineeDao.saveAndFlush(trainee);
		
		
		return tr;
	}

	@Override
	public List<Trainee> findAllTrainees() throws TraineeException{
		List<Trainee> list=traineeDao.findAll();
		return list;
	}

	@Override
	public Trainee deleteTraineeById(int traineeId) throws TraineeException {
         
		Trainee tr=null;
		if(traineeDao.existsById(traineeId))
		{
			 tr = traineeDao.findById(traineeId).get();
			 traineeDao.deleteById(traineeId);
		}
		else
		{
			throw new TraineeException(" ID NOT FOUND ");
		}
		return tr ;

			}

	@Override
	public Trainee findAllTraineeId(int traineeId) throws TraineeException {
		Trainee tr = null;
		if( traineeDao.existsById(traineeId))
		{
			tr = traineeDao.findById(traineeId).get();
		}
		else
		{
			throw new TraineeException(traineeId+ " ID NOT FOUND ");
		}
		return tr ;

		
		
	}

}
