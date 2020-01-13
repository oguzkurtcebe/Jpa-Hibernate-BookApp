package com.oguzkurtcebe.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.oguzkurtcebe.jpafactory.JpaFactory;
import com.oguzkurtcebe.jpafactory.JpaFactoryImpl;
import com.oguzkurtcebe.model.Book;

public class BookRepositoryImpl implements BookRepository {

	private JpaFactory jpaFactory = new JpaFactoryImpl();
	private EntityManager entityManager = jpaFactory.getEntityManager();
	private EntityTransaction transaction = jpaFactory.getEntityTransaction();

	@Override
	public void save(Book book) {
		transaction.begin();
		entityManager.persist(book);
		transaction.commit();

	}

	@Override
	public void delete(Book book) {
		transaction.begin();
		entityManager.remove(book);
		transaction.commit();

	}

	@Override
	public Book find(int id) {
		return entityManager.find(Book.class, id);
	}

	@Override
	public Book update(Book book) {
		transaction.begin();
		Book updateBook = entityManager.merge(book);
		transaction.commit();
		return updateBook;
	}

}
