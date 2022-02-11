package com.features.lambda.mapFlatmap;

import java.util.List;
import java.util.stream.Collectors;

import com.features.lambda.entity.Customer;
import com.features.lambda.service.CustomerService;

public class MapFlatmapDemo {

	public static void main(String[] args) {

		List<Customer> customers = CustomerService.getAllCustomers();

		// One to one mapping as we want a list of emails so use map
		// customer.getEmail() -> one to one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		// One to many mapping as we want a list of phone numbers which is a list so
		// cant use map
		// customer.getPhoneNumbers() -> one to many mapping
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		// One to many mapping as we want a list of phone numbers which is a list so
		// cant use map and hence use flat map
		// customer.getPhoneNumbers() -> one to many mapping
		List<String> phonesFlatMap = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phonesFlatMap);

	}

}
