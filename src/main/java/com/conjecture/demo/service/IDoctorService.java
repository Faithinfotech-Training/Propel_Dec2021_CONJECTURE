package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Doctor;


public interface IDoctorService {
	
	//List
	public List<Doctor> getDoctors();
	//Insert/Update
	
	public void saveDoctor(Doctor doctor);
	
	//Search By Id
	public Optional<Doctor> getDoctor(int theId);
	
	//Delete
	public void deleteDoctor(int theId);

}
