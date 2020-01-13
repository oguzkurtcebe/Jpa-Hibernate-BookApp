package com.oguzkurtcebe.jpafactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public interface JpaFactory {

	EntityManager getEntityManager();
	EntityTransaction getEntityTransaction();
	
}
