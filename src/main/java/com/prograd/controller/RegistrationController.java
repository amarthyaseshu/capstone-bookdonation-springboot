package com.prograd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prograd.model.User;
import com.prograd.service.RegistrationService;

@RestController
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService service;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	// for registratiion
	
	// when clicked register should call this method
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		// checking if user already registered
		String tempEmailId=user.getUserMail();
		if(tempEmailId!=null && !"".equals(tempEmailId)) {
	User userobj=service.fetchUserByEmailId(tempEmailId);
		if(userobj!=null)	{
			throw new Exception("user with "+tempEmailId+" already exists!");
		}
		}
		User userObj=null;
	userObj=	service.saveUser(user);
		return userObj;
	}
	

	// for login
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmailId=user.getUserMail();
		String tempPass=user.getUserPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPass!=null) {
		userObj=	service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Wrong Credentials");
		}
		return userObj;
	}
	
	

}
