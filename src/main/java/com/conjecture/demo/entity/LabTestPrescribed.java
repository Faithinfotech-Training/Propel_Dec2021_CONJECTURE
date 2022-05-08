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
@Table(name="labTestPrescribed")
public class LabTestPrescribed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer labPresID;
	
	@OneToOne
	@JoinColumn(name="testID")
	private Labtest labtest;
	
	@ManyToOne
	@JoinColumn(name="consultationID")
	private Consultation consultation;

	//default constructor
	public LabTestPrescribed() {
		super();
	}

	//setters and getters
	public Integer getLabPresID() {
		return labPresID;
	}

	public void setLabPresID(Integer labPresID) {
		this.labPresID = labPresID;
	}

	public Labtest getLabtest() {
		return labtest;
	}

	public void setLabtest(Labtest labtest) {
		this.labtest = labtest;
	}

	@JsonBackReference
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	
}
