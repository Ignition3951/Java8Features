package com.features.lambda.supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList();
		
		//OrElseGet uses supplier functional interface internally
		System.out.println(list.stream().findAny().orElseGet(() -> "List is empty"));

	}

}
