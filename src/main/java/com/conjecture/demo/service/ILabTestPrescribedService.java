package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.LabTestPrescribed;

public interface ILabTestPrescribedService {
	
	//List
	public List<LabTestPrescribed> getLabTestPrescribeds();
	//Insert/Update
	
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed);
	
	//Search By Id
	public Optional<LabTestPrescribed> getLabTestPrescribed(int theId);
	
	//Delete
	public void deleteLabTestPrescribed(int theId);

}
