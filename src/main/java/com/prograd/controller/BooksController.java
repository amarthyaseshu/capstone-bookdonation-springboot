package com.prograd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prograd.model.Books;
import com.prograd.service.BooksService;


@RestController
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	// for adding books
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addbooks")
	public Books addBooks(@RequestBody Books books){
			
		return booksService.addBooks(books);
		
	}
	
	// for viewing all books
	
//	@RequestMapping(path="/getbookslist",method=RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getbookslist")
	public List<Books> fetchBooksList(){
		List<Books> books=new ArrayList<Books>();
		books=booksService.fetchBooksList();
		return books;
	}
	
	// for getting books by id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getbooksbyid/{id}")
	public Optional<Books> fetchBooksById(@PathVariable int id){
		
		return	booksService.fetchBooksById(id);
		
	}
	
	// for deleting books by id
	@CrossOrigin(origins = "http://localhost:4200")
		@DeleteMapping("/deletebooksbyid/{id}")
		public String deleteBooksById(@PathVariable int id){
			
			return	booksService.deleteBooksById(id);
			
		}

}
