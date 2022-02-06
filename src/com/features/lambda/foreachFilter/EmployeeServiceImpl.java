package com.features.lambda.foreachFilter;

import java.util.List;
import java.util.stream.Collectors;

import com.features.lambda.entity.Employee;
import com.features.lambda.entity.EmployeeDAO;

public class EmployeeServiceImpl {

	public static List<Employee> evaluateTaxUsers(String tax) {
		return (tax.equalsIgnoreCase("tax"))
				? EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() > 600000)
						.collect(Collectors.toList())
				: EmployeeDAO.getEmployees().stream().filter(emp -> emp.getSalary() <= 600000)
						.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	}

}
