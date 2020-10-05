package com.example.customerListJDBC.domain;

public class Customer {
	
	private long id;
	private String firstname;
	private String lastname;
	
	public Customer() {
		this.id = 0;
		this.firstname = null;
		this.lastname = null;
	}

	public Customer(long id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	

    public Customer (String firstname, String lastname) {
        this.id = 0;
        this.firstname = firstname;
        this.lastname = lastname;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return String.format(
                "Person[id=%d, firstname='%s', lastname='%s']",
                id, firstname, lastname);
	}
    
    

}
