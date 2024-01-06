package com.kafkademo.in.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	public User(int id, String firstname, String lasttname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lasttname = lasttname;
	}

	@JsonProperty("id")
	private int id;
	
	private String firstname;
	
	private String lasttname;

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lasttname=" + lasttname + "]";
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}
	

}
