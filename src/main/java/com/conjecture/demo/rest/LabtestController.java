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

import com.conjecture.demo.entity.Labtest;
import com.conjecture.demo.service.ILabtestService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabtestController {
	
	@Autowired
	private ILabtestService labtestService;
	
	
	//get all labtest
	@GetMapping("/labtests")
	public List<Labtest>getAllLabtest(){
		return labtestService.getLabtest();
		
	}
	

	
	//get labtest by id
	@GetMapping("/labtests/{id}")
	public Optional<Labtest> getLabtest(@PathVariable int id){
		return labtestService.getLabtest(id);
		
	}
	
	//Add labtest
	@PostMapping("/labtests")
	public void addLabtest(@RequestBody Labtest labtest) {
		labtestService.saveLabtest(labtest);
	}
	
	//Update Labtest
	@PutMapping("/labtests")
	public void updateLabtest(@RequestBody Labtest labtest) {
		labtestService.saveLabtest(labtest);
	}
	
	//delete Employee
	@DeleteMapping("/labtests/{id}")
	public void deleteLabtest(@PathVariable int id) {
		labtestService.deleteLabtest(id);
	}
	
	//Custom method using JPQL
	@GetMapping("/labtests/search/{name}")
	public List<Labtest> getLabtestByLabtestName(@PathVariable String name){
		return labtestService.getLabtestByLabtestName(name) ;
		
	}

}
