package com.oguzkurtcebe.repository;

import com.oguzkurtcebe.model.Book;

public interface BookRepository {

	void save(Book book);
	void delete(Book book);
	Book find(int id);
	Book update(Book book);
}
