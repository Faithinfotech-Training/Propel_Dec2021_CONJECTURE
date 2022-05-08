package com.conjecture.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="department")
public class Department {

	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departmentID")
	private int departmentID;
	
	private String departmentName;
	
	//Foreign key
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private List<Specialization> specializationID;

	public Department() {
		super();
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@JsonBackReference
//	@JsonManagedReference
	public List<Specialization> getSpecializationID() {
		return specializationID;
	}

	public void setSpecializationID(List<Specialization> specializationID) {
		this.specializationID = specializationID;
	}


	
}
