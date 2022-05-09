package com.conjecture.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="consultation")
public class Consultation {
	
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="consultationID")
	private int consultationID;

	private int appointmentID;
	@OneToOne
	@JoinColumn(name="appointmentID", insertable=false,updatable=false)
	private Appointment appointment;
	
	@OneToMany(mappedBy="consultation")
	private List<MedicnePrescribed> medicinePrescribed;
	
	@OneToMany(mappedBy="consultation")
	private List<LabTestPrescribed> labTestPrescribed;
	
	@OneToMany(mappedBy="consultation")
	private List<Notes> notes;
	
	private String diagonosis;

	public Consultation() {
		super();
	}

	public int getConsultationID() {
		return consultationID;
	}

	public void setConsultationID(int consultationID) {
		this.consultationID = consultationID;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	
	public List<MedicnePrescribed> getMedicinePrescribed() {
		return medicinePrescribed;
	}

	public void setMedicinePrescribed(List<MedicnePrescribed> medicinePrescribed) {
		this.medicinePrescribed = medicinePrescribed;
	}

	@JsonManagedReference
	public List<LabTestPrescribed> getLabTestPrescribed() {
		return labTestPrescribed;
	}

	public void setLabTestPrescribed(List<LabTestPrescribed> labTestPrescribed) {
		this.labTestPrescribed = labTestPrescribed;
	}

	@JsonManagedReference
	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	public String getDiagonosis() {
		return diagonosis;
	}

	public void setDiagonosis(String diagonosis) {
		this.diagonosis = diagonosis;
	}

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	
	
}
