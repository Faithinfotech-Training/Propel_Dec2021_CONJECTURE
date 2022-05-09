package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Staff;

public interface IStaffService { 
	 
	 //List 
	  public List<Staff> getStaff(); 
	     
	  //Insert 
	  public void saveStaff(Staff staff); 
	     
	  //update by id 
	  public Optional <Staff> getStaff(int id); 
	     
	  //Delete 
	  public void deleteStaff(int id); 
	   
	  
	}