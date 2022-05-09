package com.conjecture.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conjecture.demo.entity.User;
import com.conjecture.demo.service.IUserService;


@CrossOrigin				// It helps to share data with other URL, avoid corse error
@RestController
@RequestMapping("/api")
public class UserController {
	
	//Field Injection
	@Autowired
	private IUserService userService;
	
	@GetMapping("/users/{userName}&{password}")
	public User findUserByNameAndPassword(@PathVariable String userName,@PathVariable String password) {
		
		return userService.findUserByNameAndPassword(userName, password);	
	}

}