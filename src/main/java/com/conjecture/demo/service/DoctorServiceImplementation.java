package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.IDoctorRepository;
import com.conjecture.demo.entity.Doctor;

@Service
public class DoctorServiceImplementation implements IDoctorService {

	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Override
	public List<Doctor> getDoctors() {
		
		return (List<Doctor>) doctorRepo.findAll();
	}

	//Insert /Update
	@Override
	public void saveDoctor(Doctor doctor) {
		doctorRepo.save(doctor);

	}

	@Override
	public Optional<Doctor> getDoctor(int theId) {
		return doctorRepo.findById(theId);
	}

	@Override
	public void deleteDoctor(int theId) {
		doctorRepo.deleteById(theId);
	}

}
