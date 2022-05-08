package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.MedicnePrescribed;

public interface IMedicnePrescribedService {
	
	//List
	public List<MedicnePrescribed> getMedicnePrescribeds();
	//Insert/Update
	
	public void saveMedicnePrescribed(MedicnePrescribed medicnePrescribed);
	
	//Search By Id
	public Optional<MedicnePrescribed> getMedicnePrescribed(int theId);
	
	//Delete
	public void deleteMedicnePrescribed(int theId);

}
