package com.features.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.features.lambda.entity.Employee;
import com.features.lambda.entity.EmployeeDAO;

public class SortMapDemo {

	public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			map.put("one", 1);
			map.put("four", 4);
			map.put("six", 6);
			map.put("seven", 7);
			map.put("five", 5);
			map.put("three", 3);
			
			Map<Employee, Integer> employeeMap = new HashMap<Employee, Integer>();
			List<Employee> employees = EmployeeDAO.getEmployees();
			
			employees.stream().forEach((employee) -> {
				employeeMap.put(employee, employee.getId());
			});
			
			
			
			List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
			Collections.sort(entries, (obj1,obj2) -> obj1.getKey().compareTo(obj2.getKey()));
			
			for(Entry<String, Integer> entry : entries) {
				System.out.println("KEY : "+entry.getKey() +" VALUE : "+entry.getValue());
			}
			
			//Using Streams API to sort the MAP
			employeeMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
			.forEach(employee -> System.out.println(employee));
			
			
	}

}
