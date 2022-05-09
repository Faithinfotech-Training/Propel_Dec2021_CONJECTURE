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
	
	private Integer testID;
	@OneToOne
	@JoinColumn(name="testID", insertable=false,updatable=false)
	private Labtest labtest;
	
	private Integer consultationID;
	
	@ManyToOne
	@JoinColumn(name="consultationID", insertable=false,updatable=false)
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

	public Integer getTestID() {
		return testID;
	}

	public void setTestID(Integer testID) {
		this.testID = testID;
	}

	public Integer getConsultationID() {
		return consultationID;
	}

	public void setConsultationID(Integer consultationID) {
		this.consultationID = consultationID;
	}

	
}
