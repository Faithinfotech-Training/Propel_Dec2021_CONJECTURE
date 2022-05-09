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

import com.conjecture.demo.entity.Medicine;
import com.conjecture.demo.service.IMedicineService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicineController {
	
	@Autowired
	 private IMedicineService medicineService;
	
	
	//Get all medicines
	@GetMapping("/medicines")
	public List<Medicine> getAllMedicine(){
		return medicineService.getMedicine();
	}
	
	//get medicine by id
	@GetMapping("/medicines/{id}")
	public Optional<Medicine> getMedicine(@PathVariable int id){
		return medicineService.getMedicine(id) ;
		
	}
	
	//Add Medicine
	@PostMapping("/medicines")
	public void addMedicine(@RequestBody Medicine medicine) {
		medicineService.savemedicine(medicine);
	}
	
	//Update Medicine
    @PutMapping("/medicines")
	public void updateMedicine(@RequestBody Medicine medicine) {
		medicineService.savemedicine(medicine);
	}
	
	//delete Medicine
    @DeleteMapping("/medicines/{id}")
    public void deleteMedicine(@PathVariable int id) {
    	medicineService.deleteMedicine(id);
    }
	
	//Custom method using JPQL
    @GetMapping("/medicines/search/{name}")
    public List<Medicine> getMedicineByMedicineName(@PathVariable String name){
    	return medicineService.getMedicineByMedicineName(name) ;
    }
	
	
	

}
