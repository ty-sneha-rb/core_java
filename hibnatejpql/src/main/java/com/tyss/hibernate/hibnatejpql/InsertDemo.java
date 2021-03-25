package com.tyss.hibernate.hibnatejpql;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
public static void main(String[] args) {
	EntityManager manager = null;
	EntityTransaction tx = null; //DML
	
	// it load db related info
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
	
	manager = factory.createEntityManager();
	tx = manager.getTransaction(); 
	tx.begin();
	manager.persist(factory);
	tx.commit();
	System.out.println("success");
	
	manager.close();
	
}
}
