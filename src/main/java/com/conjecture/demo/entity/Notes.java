package com.conjecture.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="notes")
public class Notes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer notesID;
	
	private Integer consultationID;
	@ManyToOne
	@JoinColumn(name="consultationID", insertable=false,updatable=false)
	private Consultation consultation;
	
	private String notes;
	private LocalDate createdOn;
	
	//default constructor
	public Notes() {
		super();
	}

	//setters and getters
	public Integer getNotesID() {
		return notesID;
	}

	public void setNotesID(Integer notesID) {
		this.notesID = notesID;
	}

	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getConsultationID() {
		return consultationID;
	}

	public void setConsultationID(Integer consultationID) {
		this.consultationID = consultationID;
	}
	
	
	
	
}
