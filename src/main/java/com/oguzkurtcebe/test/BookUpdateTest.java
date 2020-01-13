package com.oguzkurtcebe.test;

import com.oguzkurtcebe.model.Book;
import com.oguzkurtcebe.repository.BookRepository;
import com.oguzkurtcebe.repository.BookRepositoryImpl;

public class BookUpdateTest {

	public static void main(String[] args) {
		BookRepository bookRepository=new BookRepositoryImpl();
		Book book = bookRepository.find(101);
		book.setPageCount(470);
		bookRepository.update(book);
	}
	
}
