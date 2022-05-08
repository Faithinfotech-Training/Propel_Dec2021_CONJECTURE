package com.conjecture.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	//instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;

	
	private String userName;
	private String password;
	
	private boolean isActive;
	
	//Foreign key
	@ManyToOne
	@JoinColumn(name="roleID")
	private Role role;
	
	@OneToOne
	private Staff staff;

	public User() {
		super();
	}

	public User(int userID, String userName, String password, boolean isActive, Role role, Staff staff) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.role = role;
		this.staff = staff;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + ", isActive=" + isActive
				+ ", role=" + role + ", staff=" + "]";
	}
	
	
}
