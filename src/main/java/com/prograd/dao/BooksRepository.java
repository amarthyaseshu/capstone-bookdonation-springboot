package com.prograd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograd.model.Books;

public interface BooksRepository extends JpaRepository <Books, Integer> {

}
