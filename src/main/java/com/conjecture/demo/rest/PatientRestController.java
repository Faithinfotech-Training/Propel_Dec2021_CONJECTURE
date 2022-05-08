package com.conjecture.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conjecture.demo.entity.Patient;
import com.conjecture.demo.service.IPatientService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class PatientRestController {

	@Autowired
	private IPatientService patientService;
	

	//get all patients
	@GetMapping("/patients")
	public List<Patient> getAllPatients(){
		
		return patientService.getPatients();
		
	}
	
	//Get Employee By Id
	@GetMapping("/patients/{theId}")
	public Optional<Patient> getPatient(@PathVariable int theId) {
				
		return patientService.getPatient(theId);
				
	}
	
	//Add Employee
	@PostMapping("/patients")
	public void addPatient(@RequestBody Patient patient) {
		patientService.savePatient(patient);
	}
			
	//Update Employee
	@PutMapping("/patients")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.savePatient(patient);
				
	}
			
	//Delete Employee
	@DeleteMapping("/patients/{theId}")
	public void deletePatient(@PathVariable int theId) {
		patientService.deletePatient(theId);
	}


}
