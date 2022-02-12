package com.features.lambda.optional;

import java.util.Arrays;
import java.util.Optional;

import com.features.lambda.entity.Customer;

public class OptionalImpl {

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(1, null, "Anuj", Arrays.asList("9823427823", "9823427824"));
		
		System.out.println(Optional.ofNullable(customer.getEmail()).orElse("default email is returned"));
		
		//System.out.println(Optional.ofNullable(customer.getEmail()).orElseThrow(()-> new Exception("Email not present!!!")));
		
		Optional<String> emailOfNullable = Optional.ofNullable(customer.getEmail());

		System.out.println(emailOfNullable.map(String::toUpperCase).orElseGet(() -> "default email is returned"));
		
		//Optional generally used at handling getter scenarios for Object level
		DemoOptional demoOptional = new DemoOptional(1, null);
		
		System.out.println(demoOptional.getName());
	}

}

class DemoOptional {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public DemoOptional(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DemoOptional [id=" + id + ", name=" + name + "]";
	}

}
