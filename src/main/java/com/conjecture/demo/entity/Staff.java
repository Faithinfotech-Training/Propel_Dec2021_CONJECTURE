package com.conjecture.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="staff")
public class Staff {
	
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffID;
	
	@OneToOne(mappedBy="staff")
	@JoinColumn(name="userID")
	private User user;
	
	private String staffNo;
	private String fullName;
	private String email;
	private LocalDate dateOfBirth;
	private String phoneNumber;
	private String address;
	private LocalDate dateOfJoin;
	private Double salary;
	private boolean isActive;
	
	
	public Staff() {
		super();
	}


	public Staff(int staffID, User user, String staffNo, String fullName, String email, LocalDate dateOfBirth,
			String phoneNumber, String address, LocalDate dateOfJoin, Double salary, boolean isActive) {
		super();
		this.staffID = staffID;
		this.user = user;
		this.staffNo = staffNo;
		this.fullName = fullName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.isActive = isActive;
	}


	public int getStaffID() {
		return staffID;
	}


	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getStaffNo() {
		return staffNo;
	}


	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}


	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Staff [staffID=" + staffID + ", user=" + user + ", staffNo=" + staffNo + ", fullName=" + fullName
				+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", dateOfJoin=" + dateOfJoin + ", salary=" + salary + ", isActive=" + isActive + "]";
	}
	
	

}
