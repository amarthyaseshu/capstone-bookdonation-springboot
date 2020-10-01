package com.prograd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books  {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String bookName;
	
	@Column
	private String bookAuthor;
	
	@Column
	private String bookEdition;
	
	@Column
	private String bookDescription;
	
	@Column
	private int bookPrice;
	
	@Column
	private String bookCategory;
	
	@Column
	private int bookQuantity;
	
	@Column
	private String bookQualityRating;
	
	@Column
	private String bookContentRating;
	
	@Column
	private String bookPickupDetails;
	
	@Column
	private String bookImageUrl;
	
	
	public Books() {
		
	}


	public Books(int id, String bookName, String bookAuthor, String bookEdition, String bookDescription, int bookPrice,
			String bookCategory, int bookQuantity, String bookQualityRating, String bookContentRating,
			String bookPickupDetails, String bookImageUrl) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookEdition = bookEdition;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
		this.bookCategory = bookCategory;
		this.bookQuantity = bookQuantity;
		this.bookQualityRating = bookQualityRating;
		this.bookContentRating = bookContentRating;
		this.bookPickupDetails = bookPickupDetails;
		this.bookImageUrl = bookImageUrl;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	


	public String getBookAuthor() {
		return bookAuthor;
	}



	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}



	public String getBookEdition() {
		return bookEdition;
	}



	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}



	public String getBookDescription() {
		return bookDescription;
	}


	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getBookCategory() {
		return bookCategory;
	}


	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}


	public int getBookQuantity() {
		return bookQuantity;
	}


	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}


	public String getBookQualityRating() {
		return bookQualityRating;
	}


	public void setBookQualityRating(String bookQualityRating) {
		this.bookQualityRating = bookQualityRating;
	}


	public String getBookContentRating() {
		return bookContentRating;
	}


	public void setBookContentRating(String bookContentRating) {
		this.bookContentRating = bookContentRating;
	}


	public String getBookPickupDetails() {
		return bookPickupDetails;
	}


	public void setBookPickupDetails(String bookPickupDetails) {
		this.bookPickupDetails = bookPickupDetails;
	}


	public String getBookImageUrl() {
		return bookImageUrl;
	}


	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	
}

	
