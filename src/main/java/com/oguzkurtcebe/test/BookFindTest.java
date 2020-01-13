package com.oguzkurtcebe.test;

import com.oguzkurtcebe.model.Book;
import com.oguzkurtcebe.repository.BookRepository;
import com.oguzkurtcebe.repository.BookRepositoryImpl;

public class BookFindTest {
public static void main(String[] args) {
	BookRepository bookRepository=new BookRepositoryImpl();

	Book book = bookRepository.find(100);

	if(book!=null) {
		System.out.println("Ürün Bilgileri");
		System.out.println(book);
	}else {
		System.out.println("Ürün bulunamadý");
	}
}
}
