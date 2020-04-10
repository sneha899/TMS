package com.cg.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tms.entity.Trainee;
import com.cg.tms.exception.TraineeException;
import com.cg.tms.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	TraineeService traineeService;
	
	@GetMapping("trainee/{id}")
	public ResponseEntity<Trainee> findAllTraineeId(@PathVariable("id")  int id) throws TraineeException 
	{
		Trainee  trainees = traineeService.findAllTraineeId(id);
		   ResponseEntity<Trainee>  tr = new ResponseEntity<>(trainees,HttpStatus.OK);
		   return tr;
		
	}

	@PostMapping("trainee")
	public ResponseEntity<Trainee> createTrainee(@RequestBody Trainee trainee)
	{
		Trainee t=traineeService.createTrainee(trainee);
		
		ResponseEntity<Trainee> tr=new ResponseEntity<Trainee>(t,HttpStatus.OK);
		
		return tr;
	}
	@GetMapping("trainee")
	public ResponseEntity<List<Trainee>> findAllTrainees() throws TraineeException
	{
		List<Trainee> list = traineeService.findAllTrainees();
		ResponseEntity<List<Trainee>>  rt = new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
		return rt;
			}
	
	@DeleteMapping("trainee/{id}")
	public ResponseEntity<Trainee> deleteTraineeById(@PathVariable("id") int traineeId) throws TraineeException
	{

		ResponseEntity<Trainee>  rt = null;
		
		
	    Trainee re = traineeService.deleteTraineeById(traineeId);
		rt= new ResponseEntity<Trainee>(re,HttpStatus.OK);
		
		return rt;
	}
	
}
