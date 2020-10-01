package com.prograd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prograd.model.Contact;
import com.prograd.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	// for adding books
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/addcontact")
		public Contact addContact(@RequestBody Contact contact){
				
			return contactService.addContact(contact);
			
		}

}
