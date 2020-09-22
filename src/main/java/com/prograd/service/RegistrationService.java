package com.prograd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prograd.dao.UserRepository;
import com.prograd.model.User;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
	return	repo.findByUserMail(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return	repo.findByUserMailAndUserPassword(email,password);
		}

}
