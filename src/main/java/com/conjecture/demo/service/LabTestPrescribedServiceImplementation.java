package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.ILabTestPrescribedRepository;
import com.conjecture.demo.entity.LabTestPrescribed;

@Service
public class LabTestPrescribedServiceImplementation implements ILabTestPrescribedService {
	@Autowired
	private ILabTestPrescribedRepository labTestPrescribedRepo;
	
	@Override
	public List<LabTestPrescribed> getLabTestPrescribeds() {
		return (List<LabTestPrescribed>) labTestPrescribedRepo.findAll();
	}

	@Override
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed) {
		labTestPrescribedRepo.save(labTestPrescribed);
	}

	@Override
	public Optional<LabTestPrescribed> getLabTestPrescribed(int theId) {
		return labTestPrescribedRepo.findById(theId);
	}

	@Override
	public void deleteLabTestPrescribed(int theId) {
		labTestPrescribedRepo.deleteById(theId);
	}

	@Override
	public List<LabTestPrescribed> getTestPrescribedByConsultID(int theId) {
		return (List<LabTestPrescribed>) labTestPrescribedRepo.testPrescribedByConsultId(theId);
	}

}
