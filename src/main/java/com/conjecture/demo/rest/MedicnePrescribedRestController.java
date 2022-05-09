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

import com.conjecture.demo.entity.MedicnePrescribed;
import com.conjecture.demo.service.IMedicnePrescribedService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class MedicnePrescribedRestController {

	@Autowired
	private IMedicnePrescribedService medicnePrescribedService;
	
	//get all medicnePrescribeds
	@GetMapping("/medpres")
	public List<MedicnePrescribed> getAllMedicnePrescribeds(){
		
		return medicnePrescribedService.getMedicnePrescribeds();
		
	}
	
	//Get Employee By Id
	@GetMapping("/medpres/{theId}")
	public Optional<MedicnePrescribed> getMedicnePrescribed(@PathVariable int theId) {
				
		return medicnePrescribedService.getMedicnePrescribed(theId);
				
	}
	
	//Add Employee
	@PostMapping("/medpres")
	public void addMedicnePrescribed(@RequestBody MedicnePrescribed medicnePrescribed) {
		medicnePrescribedService.saveMedicnePrescribed(medicnePrescribed);
	}
			
	//Update Employee
	@PutMapping("/medpres")
	public void updateMedicnePrescribed(@RequestBody MedicnePrescribed medicnePrescribed) {
		medicnePrescribedService.saveMedicnePrescribed(medicnePrescribed);
				
	}
			
	//Delete Employee
	@DeleteMapping("/medpres/{theId}")
	public void deleteMedicnePrescribed(@PathVariable int theId) {
		medicnePrescribedService.deleteMedicnePrescribed(theId);
	}
	
	//get medicines prescribed by consultation ID
	@GetMapping("/medpres/meds/{theId}")
	public List<MedicnePrescribed> getMedicnePrescribedbyConsulID(@PathVariable int theId) {
				
		return medicnePrescribedService.getMedicnePrescribedByConsultID(theId);
				
	}
	

}
