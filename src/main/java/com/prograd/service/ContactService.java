package com.prograd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prograd.dao.ContactRepository;
import com.prograd.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	

	public Contact addContact(Contact contact) {
		return	contactRepo.save(contact);
		}
	
	
}
