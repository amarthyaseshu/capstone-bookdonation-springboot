package com.prograd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograd.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUserMail(String email);
	
	public User findByUserMailAndUserPassword(String email,String password);

}
