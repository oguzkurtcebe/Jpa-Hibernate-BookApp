package com.oguzkurtcebe.test;

import java.util.Calendar;
import java.util.Date;

import com.oguzkurtcebe.model.Book;
import com.oguzkurtcebe.repository.BookRepository;
import com.oguzkurtcebe.repository.BookRepositoryImpl;

public class BookCreateTest {

	public static void main(String[] args) {

		Book book1 = new Book("Hayvan Çifliði", 180, "Distopya", "George Orwell", createCustomDate(18, 11, 1945));
		Book book2 = new Book("Serenad", 420, "Tarih ve Aþk", "Zülfü Livaneli", createCustomDate(06, 9, 2002));
		Book book3 = new Book("Uçurtma Avcýsý", 470, "Dram", "Halid Hüseyin", createCustomDate(06, 3, 2004));
		
		BookRepository bookRepository=new BookRepositoryImpl();
		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
	}

	public static Date createCustomDate(int day, int month, int year) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();

	}

}
