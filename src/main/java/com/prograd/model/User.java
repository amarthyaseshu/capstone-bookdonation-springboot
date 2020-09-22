package com.prograd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER",schema="SYSTEM")
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String userName;
	@Column
	private String userMobile;
	@Column
	private String userMail;
	@Column
	private String userPassword;
	
	public User() {
		
	}


	public User(int id, String userName, String userMobile, String userMail, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userMail = userMail;
		this.userPassword = userPassword;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
