package com.tyss.designpattern.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeDAOJPAIMPL implements EmpolyeeDAO {

	@Override
	public EmployeePrimaryInfo getDetaillByEmployeeID(int eid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, eid);
		if (info != null) {
			return info;

		} else {
			return null;
		}
	}// End OF The getDetaillByEmployeeID

	@Override
	public boolean deleteByEmployeeID(int eid) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		try {
			manager = factory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			EmployeePrimaryInfo employee = manager.find(EmployeePrimaryInfo.class ,eid );
			manager.remove(employee);
			tx.commit();
			if (employee != null) {
				return true;
			} else {
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		manager.close();
		return false;
	}


	@Override
	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");

		try {
			manager = factory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			manager.persist(info);
			tx.commit();
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		manager.close();
		return false;
	}
	

	@Override
	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");

		try {
			manager = factory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, info.getEmp_id());
			employeePrimaryInfo.setName(info.getName());
			tx.commit();
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		manager.close();
		return false;
	}

	

	@Override
	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manger = factory.createEntityManager();
		String jpql = "select e from EmployeePrimaryInfo e";
		Query qry = manger.createQuery(jpql);
		List<EmployeePrimaryInfo> employees = qry.getResultList();
		return employees;
	}

}// End Of The Class

