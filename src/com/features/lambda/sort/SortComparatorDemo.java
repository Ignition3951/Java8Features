package com.features.lambda.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.features.lambda.entity.Employee;
import com.features.lambda.entity.EmployeeDAO;

public class SortComparatorDemo {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeDAO.getEmployees();

		Collections.sort(employees, new MyComparator());

		System.out.println(employees);
		
		//Using the streams API
		//employees.stream().sorted((emp0,emp1) -> emp0.getSalary()-emp1.getSalary()).forEach(emp -> System.out.println(emp));
		
		//Further refactoring the code
		//employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(emp -> System.out.println(emp));
		
		//Further code improvement
		employees.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(emp -> System.out.println(emp));

	}

}

//Traditional approach for comparator object referencing
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp0, Employee emp1) {
		// TODO Auto-generated method stub
		return emp0.getSalary() - emp1.getSalary();
	}

}
