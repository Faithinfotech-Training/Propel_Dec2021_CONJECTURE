package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.IPatientRepository;
import com.conjecture.demo.entity.Patient;

@Service
public class PatientServiceImplementation implements IPatientService {

	@Autowired
	private IPatientRepository patientRepo;
	
	@Override
	public List<Patient> getPatients() {
		return (List<Patient>) patientRepo.findAll();
	}

	@Override
	public void savePatient(Patient patient) {
		patientRepo.save(patient);
	}

	@Override
	public Optional<Patient> getPatient(int theId) {
		return patientRepo.findById(theId);
	}

	@Override
	public void deletePatient(int theId) {
		patientRepo.deleteById(theId);
	}

}
