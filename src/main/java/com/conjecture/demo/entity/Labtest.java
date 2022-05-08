package com.conjecture.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="labtest")
public class Labtest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer testID;
	
	private Integer testCode;
	private String testName;
	private Double lowRange;
	private Double highRange;
	private String unit;
	private Double price;
	private String isActive;
	
	//default constructor
	public Labtest() {
		super();
	}

	public Integer getTestID() {
		return testID;
	}

	public void setTestID(Integer testID) {
		this.testID = testID;
	}

	public Integer getTestCode() {
		return testCode;
	}

	public void setTestCode(Integer testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getLowRange() {
		return lowRange;
	}

	public void setLowRange(Double lowRange) {
		this.lowRange = lowRange;
	}

	public Double getHighRange() {
		return highRange;
	}

	public void setHighRange(Double highRange) {
		this.highRange = highRange;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Labtest [testID=" + testID + ", testCode=" + testCode + ", testName=" + testName + ", lowRange="
				+ lowRange + ", highRange=" + highRange + ", unit=" + unit + ", price=" + price + ", isActive="
				+ isActive + "]";
	}
	
	
}
