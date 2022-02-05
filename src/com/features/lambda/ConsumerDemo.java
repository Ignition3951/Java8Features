package com.features.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = t -> System.out.println("The number is : " + t);
		consumer.accept(10);
	}

}
