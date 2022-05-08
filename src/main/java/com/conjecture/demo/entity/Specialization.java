package com.conjecture.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="specialization")
public class Specialization {
	
	//instance variables
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int specializationID;
	
	private String specialization;
	private Double consultationFee;
	

	//Foreign key
	@ManyToOne
	@JoinColumn(name="departmentID")
	private Department department;

	public Specialization() {
		super();
	}

	public Specialization(int specializationID, String specialization, Double consultationFee, Department department) {
		super();
		this.specializationID = specializationID;
		this.specialization = specialization;
		this.consultationFee = consultationFee;
		this.department = department;
	}

	//getters and setters
	public int getSpecializationID() {
		return specializationID;
	}

	public void setSpecializationID(int specializationID) {
		this.specializationID = specializationID;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(Double consultationFee) {
		this.consultationFee = consultationFee;
	}

	@JsonBackReference
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Specialization [specializationID=" + specializationID + ", specialization=" + specialization
				+ ", consultationFee=" + consultationFee + ", department=" +  "]";
	}
	
	
}
