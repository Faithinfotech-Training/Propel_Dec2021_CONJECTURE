package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.IAppointmentRepository;
import com.conjecture.demo.entity.Appointment;

@Service
public class AppointmentServiceImplementation implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepo;

	@Override
	public List<Appointment> getAppointments() {
		return (List<Appointment>) appointmentRepo.findAll();
	}

	@Override
	public void saveAppointment(Appointment appointment) {
		appointmentRepo.save(appointment);
	}

	@Override
	public Optional<Appointment> getAppointment(int theId) {
		return appointmentRepo.findById(theId);
	}

	@Override
	public void deleteAppointment(int theId) {
		appointmentRepo.deleteById(theId);
	}

}
