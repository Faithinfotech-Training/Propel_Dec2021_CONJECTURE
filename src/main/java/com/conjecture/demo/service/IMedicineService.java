package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Medicine;



public interface IMedicineService {
	
	//list
	 public List <Medicine> getMedicine();
	 
	 //insert/update
	 public void savemedicine(Medicine medicine);
	 
	 //search by id
	 public Optional <Medicine> getMedicine(int id);
	 
	 //delete
	 public void deleteMedicine(int id);
	 
	 //find by MedicineName---Custom Methods
	 public List<Medicine> getMedicineByMedicineName(String name);
	 
	 
	 

}
