package com.conjecture.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conjecture.demo.entity.Staff;
import com.conjecture.demo.service.IStaffService;


@CrossOrigin 
@RestController 
@RequestMapping("/api") 
public class StaffController { 
 
 @Autowired 
 private IStaffService staffservice; 
  
 //Get all Employees 
  @GetMapping("/staffs") 
  public List<Staff> getAllStaff() { 
   return staffservice.getStaff(); 
    
  } 
   
  //Get employee by id 
  @GetMapping("/staffs/{id}") 
  public Optional <Staff> getStaff(@PathVariable int id) { 
   return staffservice.getStaff(id); 
  } 
   
  //Add employee 
  @PostMapping("/staffs") 
  public void addStaff(@RequestBody Staff staff) { 
   staffservice.saveStaff(staff); 
   
  } 
   
  //update employee 
  @PutMapping("/staffs") 
  public void updateStaff(@RequestBody Staff staff) { 
   staffservice.saveStaff(staff); 
 
  } 
   
  //Delete staff 
  @PutMapping("/staffs/{id}") 
  public void deleteEmployee(@PathVariable int id) { 
   staffservice.deleteStaff(id); 
 
  } 
}