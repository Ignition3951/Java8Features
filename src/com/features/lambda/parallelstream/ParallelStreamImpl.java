package com.features.lambda.parallelstream;

import java.util.List;

import com.features.lambda.entity.Employee;

public class ParallelStreamImpl {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeGeneration.generateEmployeesWithRange(10);
		
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		double avgDoubleSalaryWithStream = employees.stream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		
		System.out.println("Time taken for normal stream to complete : "+(end-start)+" Average Salary is :"+avgDoubleSalaryWithStream);
		
		long start1=System.currentTimeMillis();
		double avgDoubleSalaryWithParalleStream = employees.parallelStream().map(Employee::getSalary).mapToInt(i->i).average().getAsDouble();
		long end1=System.currentTimeMillis();
		
		System.out.println("Time taken for parallel stream to complete : "+(end1-start1)+" Average Salary is :"+avgDoubleSalaryWithParalleStream);
	}

}
