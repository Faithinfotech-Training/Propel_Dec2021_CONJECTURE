package com.conjecture.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="medicinePrescribed")
public class MedicnePrescribed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer medPresID;
	
	@OneToOne
	@JoinColumn(name="medicineID")
	private Medicine medicine;
	
	@ManyToOne
	@JoinColumn(name="consultationID")
	private Consultation consultation;
	
	private String medinterval;
	private String dosage;
	
	//default constructor
	public MedicnePrescribed() {
		super();
	}

	//getters and setters
	public Integer getMedPredID() {
		return medPresID;
	}

	public void setMedPredID(Integer medPredID) {
		this.medPresID = medPredID;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public String getInterval() {
		return medinterval;
	}

	public void setInterval(String interval) {
		this.medinterval = interval;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	//to String 
	@Override
	public String toString() {
		return "MedicnePrescribed [medPredID=" + medPresID + ", medicine=" + medicine + ", consultation=" + consultation
				+ ", medinterval=" + medinterval + ", dosage=" + dosage + "]";
	}
	
	
	
}
