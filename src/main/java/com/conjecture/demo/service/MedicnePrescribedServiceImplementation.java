package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.IMedicnePrescribedRepository;
import com.conjecture.demo.entity.MedicnePrescribed;

@Service
public class MedicnePrescribedServiceImplementation implements IMedicnePrescribedService {
	
	@Autowired
	private IMedicnePrescribedRepository medicinePrescribedRepo;
	
	@Override
	public List<MedicnePrescribed> getMedicnePrescribeds() {
		return (List<MedicnePrescribed>) medicinePrescribedRepo.findAll();
	}

	@Override
	public void saveMedicnePrescribed(MedicnePrescribed medicnePrescribed) {
		medicinePrescribedRepo.save(medicnePrescribed);
	}

	@Override
	public Optional<MedicnePrescribed> getMedicnePrescribed(int theId) {
		return medicinePrescribedRepo.findById(theId);
	}

	@Override
	public void deleteMedicnePrescribed(int theId) {
		medicinePrescribedRepo.deleteById(theId);

	}

}
