package com.features.lambda.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(123, "Anuj", "IT", 400000));
		employees.add(new Employee(124, "Ravi", "CIVIL", 500000));
		employees.add(new Employee(125, "Sahil", "CS", 600000));
		employees.add(new Employee(126, "Bhatia", "EI", 700000));
		employees.add(new Employee(127, "Subram", "EC", 800000));
		employees.add(new Employee(128, "Avinash", "AI", 900000));
		employees.add(new Employee(129, "Mehul", "ML", 1000000));
		return employees;
	}

}
