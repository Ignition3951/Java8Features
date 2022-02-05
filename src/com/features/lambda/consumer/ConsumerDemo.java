package com.features.lambda.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
//		Consumer<Integer> consumer = t -> System.out.println("The number is : " + t);
//		consumer.accept(10);
		
		//for each internally uses Consumer functional interface  as described above
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(t -> System.out.println("The number is : " + t));
	}

}
