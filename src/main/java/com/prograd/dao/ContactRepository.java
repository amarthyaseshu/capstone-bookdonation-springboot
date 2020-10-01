package com.prograd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograd.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
