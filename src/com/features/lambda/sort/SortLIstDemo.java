package com.features.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLIstDemo {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(12);
		numbers.add(25);
		numbers.add(43);
		numbers.add(78);
		numbers.add(34);
		numbers.add(19);

		// ascending order
		Collections.sort(numbers);
		System.out.println(numbers);

		// descending order
		Collections.reverse(numbers);
		System.out.println(numbers);

		// Using the stream api
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

	}

}
