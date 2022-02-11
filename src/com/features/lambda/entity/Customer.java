package com.features.lambda.entity;

import java.util.List;

public class Customer {

	private int id;
	private String email;
	private String name;
	private List<String> phoneNumbers;

	public Customer() {
		super();
	}

	public Customer(int id, String email, String name, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}

}
