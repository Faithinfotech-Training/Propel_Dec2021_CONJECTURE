package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Patient;

public interface IPatientService {
	
	//List
	public List<Patient> getPatients();
	//Insert/Update
	
	public void savePatient(Patient patient);
	
	//Search By Id
	public Optional<Patient> getPatient(int theId);
	
	//Delete
	public void deletePatient(int theId);

}
