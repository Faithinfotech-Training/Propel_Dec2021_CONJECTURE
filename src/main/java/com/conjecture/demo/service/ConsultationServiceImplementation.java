package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.IConsultationRepositoty;
import com.conjecture.demo.entity.Consultation;

@Service
public class ConsultationServiceImplementation implements IConsultationService {
	
	@Autowired
	private IConsultationRepositoty consultationRepo;

	@Override
	public List<Consultation> getConsultations() {
		return (List<Consultation>) consultationRepo.findAll();
	}

	@Override
	public void saveConsultation(Consultation consultation) {
		consultationRepo.save(consultation);
	}

	@Override
	public Optional<Consultation> getConsultation(int theId) {
		return consultationRepo.findById(theId);
	}

	@Override
	public void deleteConsultation(int theId) {
		consultationRepo.deleteById(theId);
	}

}
