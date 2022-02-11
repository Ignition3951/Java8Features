package com.features.lambda.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.features.lambda.entity.Customer;

public class CustomerService {
		
		public static List<Customer> getAllCustomers() {
			
			List<Customer> customers = new ArrayList<Customer>();
			customers.add(new Customer(1, "One@gmail.com", "Anuj", Arrays.asList("9823427823","9823427824")));
			customers.add(new Customer(2, "Two@gmail.com", "Gaaurav", Arrays.asList("9823427825","9823427826")));
			customers.add(new Customer(3, "Three@gmail.com", "Chomu", Arrays.asList("9823427832","9823427827")));
			customers.add(new Customer(4, "Four@gmail.com", "Saurabh", Arrays.asList("9823427833","9823427828")));
			customers.add(new Customer(5, "Five@gmail.com", "Bheem", Arrays.asList("9823427834","9823427829")));
			customers.add(new Customer(6, "Six@gmail.com", "Keshav", Arrays.asList("9823427831","9823427830")));
			return customers;
		}

}
