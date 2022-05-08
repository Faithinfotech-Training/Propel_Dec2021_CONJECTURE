package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Consultation;

public interface IConsultationService {
	
	//List
	public List<Consultation> getConsultations();
	//Insert/Update
	
	public void saveConsultation(Consultation consultation);
	
	//Search By Id
	public Optional<Consultation> getConsultation(int theId);
	
	//Delete
	public void deleteConsultation(int theId);

}
