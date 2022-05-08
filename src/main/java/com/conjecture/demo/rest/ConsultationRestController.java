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

import com.conjecture.demo.entity.Consultation;
import com.conjecture.demo.service.IConsultationService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class ConsultationRestController {
	
	@Autowired
	private IConsultationService consultationService;
	
	//get all consultations
	@GetMapping("/consultations")
	public List<Consultation> getAllConsultations(){
		
		return consultationService.getConsultations();
		
	}
	
	//Get Employee By Id
	@GetMapping("/consultations/{theId}")
	public Optional<Consultation> getConsultation(@PathVariable int theId) {
				
		return consultationService.getConsultation(theId);
				
	}
	
	//Add Employee
	@PostMapping("/consultations")
	public void addConsultation(@RequestBody Consultation consultation) {
		consultationService.saveConsultation(consultation);
	}
			
	//Update Employee
	@PutMapping("/consultations")
	public void updateConsultation(@RequestBody Consultation consultation) {
		consultationService.saveConsultation(consultation);
				
	}
			
	//Delete Employee
	@DeleteMapping("/consultations/{theId}")
	public void deleteConsultation(@PathVariable int theId) {
		consultationService.deleteConsultation(theId);
	}

}
