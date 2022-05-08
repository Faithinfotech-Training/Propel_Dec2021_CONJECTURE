package com.conjecture.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conjecture.demo.entity.Appointment;
import com.conjecture.demo.service.IAppointmentService;

@CrossOrigin //avoid CORS
@RestController
@RequestMapping("/api")
public class AppointmentRestContoller {
	
	@Autowired
	private IAppointmentService appointmentService;
	
	//get all appointments
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointments(){
		
		return appointmentService.getAppointments();
		
	}
	
	//Get Employee By Id
	@GetMapping("/appointments/{theId}")
	public Optional<Appointment> getAppointment(@PathVariable int theId) {
				
		return appointmentService.getAppointment(theId);
				
	}
	
	//Add Employee
	@PostMapping("/appointments")
	public void addAppointment(@RequestBody Appointment appointment) {
		appointmentService.saveAppointment(appointment);
	}
			
	//Update Employee
	@PutMapping("/appointments")
	public void updateAppointment(@RequestBody Appointment appointment) {
		appointmentService.saveAppointment(appointment);
				
	}
			
	//Delete Employee
	@DeleteMapping("/appointments/{theId}")
	public void deleteAppointment(@PathVariable int theId) {
		appointmentService.deleteAppointment(theId);
	}

}
