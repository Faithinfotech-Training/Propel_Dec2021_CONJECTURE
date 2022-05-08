package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Appointment;

public interface IAppointmentService {

	//List
	public List<Appointment> getAppointments();
	//Insert/Update
	
	public void saveAppointment(Appointment appointment);
	
	//Search By Id
	public Optional<Appointment> getAppointment(int theId);
	
	//Delete
	public void deleteAppointment(int theId);
}
