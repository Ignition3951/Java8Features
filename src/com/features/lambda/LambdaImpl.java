package com.features.lambda;

import java.util.Collections;
import java.util.List;

import com.features.lambda.entity.BookDao;
import com.features.lambda.service.BookService;

public class LambdaImpl {
	
	public static void main(String[] args) {
		List<BookDao> books = new BookService().getBooks();
		
		Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(books.toString());
	}

}
