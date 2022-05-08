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

import com.conjecture.demo.entity.LabTestPrescribed;
import com.conjecture.demo.service.ILabTestPrescribedService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class LabTestPrescribedRestController {

	@Autowired
	private ILabTestPrescribedService labTestPrescribedService;
	

	//get all labTestPrescribeds
	@GetMapping("/labpres")
	public List<LabTestPrescribed> getAllLabTestPrescribeds(){
		
		return labTestPrescribedService.getLabTestPrescribeds();
		
	}
	
	//Get Employee By Id
	@GetMapping("/labpres/{theId}")
	public Optional<LabTestPrescribed> getLabTestPrescribed(@PathVariable int theId) {
				
		return labTestPrescribedService.getLabTestPrescribed(theId);
				
	}
	
	//Add Employee
	@PostMapping("/labpres")
	public void addLabTestPrescribed(@RequestBody LabTestPrescribed labTestPrescribed) {
		labTestPrescribedService.saveLabTestPrescribed(labTestPrescribed);
	}
			
	//Update Employee
	@PutMapping("/labpres")
	public void updateLabTestPrescribed(@RequestBody LabTestPrescribed labTestPrescribed) {
		labTestPrescribedService.saveLabTestPrescribed(labTestPrescribed);
				
	}
			
	//Delete Employee
	@DeleteMapping("/labpres/{theId}")
	public void deleteLabTestPrescribed(@PathVariable int theId) {
		labTestPrescribedService.deleteLabTestPrescribed(theId);
	}

}
