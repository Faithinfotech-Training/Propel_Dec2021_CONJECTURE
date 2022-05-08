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

import com.conjecture.demo.entity.Doctor;
import com.conjecture.demo.service.IDoctorService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class DoctorRestController {
	
	@Autowired
	private IDoctorService doctorService;
	
	//get all doctors
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		
		return doctorService.getDoctors();
		
	}
	
	//Get Employee By Id
	@GetMapping("/doctors/{theId}")
	public Optional<Doctor> getDoctor(@PathVariable int theId) {
				
		return doctorService.getDoctor(theId);
				
	}
	
	//Add Employee
	@PostMapping("/doctors")
	public void addDoctor(@RequestBody Doctor doctor) {
		doctorService.saveDoctor(doctor);
	}
			
	//Update Employee
	@PutMapping("/doctors")
	public void updateDoctor(@RequestBody Doctor doctor) {
		doctorService.saveDoctor(doctor);
				
	}
			
	//Delete Employee
	@DeleteMapping("/doctors/{theId}")
	public void deleteDoctor(@PathVariable int theId) {
		doctorService.deleteDoctor(theId);
	}

}
