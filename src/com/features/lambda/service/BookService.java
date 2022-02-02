package com.features.lambda.service;

import java.util.ArrayList;
import java.util.List;

import com.features.lambda.entity.BookDao;

public class BookService {
	
	public List<BookDao> getBooks(){
		List<BookDao> books =new ArrayList<>();
		books.add(new BookDao(1, "spring", 345));
		books.add(new BookDao(2, "hibernate", 4443));
		books.add(new BookDao(3, "core java", 567));
		books.add(new BookDao(4, "adv java", 123));
		books.add(new BookDao(5, "spring boot", 267));
		books.add(new BookDao(6, "spring mvc", 789));
		return books;
	}
	

}
