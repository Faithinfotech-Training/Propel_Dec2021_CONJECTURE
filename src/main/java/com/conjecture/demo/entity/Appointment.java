package com.conjecture.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="appointment")
public class Appointment {

	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appointmentID;
	private String tokenNumber;
	
	private Integer doctorID;
	//ForeignKey
	@ManyToOne
	@JoinColumn(name="doctorID", insertable=false,updatable=false)
	private Doctor doctor;
	
	private Integer patientID;
	//ForeignKey
	@ManyToOne
	@JoinColumn(name="patientID", insertable=false,updatable=false)
	private Patient patient;
	
	private LocalDate DateOfAppointment;
	private LocalDate CreatedOn;
	private boolean isActive;
	
	public Appointment() {
		super();
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public String getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(String tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

//	@JsonBackReference
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getDateOfAppointment() {
		return DateOfAppointment;
	}

	public void setDateOfAppointment(LocalDate dateOfAppointment) {
		DateOfAppointment = dateOfAppointment;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDate getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		CreatedOn = createdOn;
	}

	public Integer getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	
	
}
