package com.features.lambda.parallelstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.features.lambda.entity.Employee;

public class EmployeeGeneration {
	
	public static List<Employee> generateEmployeesWithRange(int range) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		for(int i=0;i<=range;i++) {
			employees.add(new Employee(i, "RandomName"+i, "RandomDepartment"+i, new Random().ints(1,9).findFirst().getAsInt()*10000));
		}
		return employees;
	}

}
