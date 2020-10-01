package com.prograd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prograd.dao.BooksRepository;
import com.prograd.model.Books;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository bookrepo;
	
	
	public Books addBooks(Books books) {
	return	bookrepo.save(books);
	}

	public List<Books> fetchBooksList(){
		return bookrepo.findAll();	
	}
	
	public Optional<Books> fetchBooksById(int id){
		return bookrepo.findById(id);
	}
	
	
	public String deleteBooksById(int id){
		
		String result;
		
		try {
			 bookrepo.deleteById(id);;
			 result="product deleted succesfully";
		}
		catch(Exception e) {
			result="product  not deleted";
		}
		return result;
	
	}	
	
}
