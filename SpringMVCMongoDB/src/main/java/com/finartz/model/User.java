package com.finartz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	 	@Id
	    private String id;
	    private String name;	   
		private String surname;
	    private String phoneNo;

	    public User() {
	        super();
	    }

	    public User(String id, String name,String surname, String phoneNo) {
	        this.id = id;
	        this.name = name;
	        this.surname = surname;
			this.phoneNo = phoneNo;
	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}	 
}