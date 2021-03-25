package com.tyss.designpattern.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}

	private static String dbInteractionType = "hibernate";

	public static EmpolyeeDAO getInstance() {
		EmpolyeeDAO dao = null;
		if (dbInteractionType.equalsIgnoreCase("JDBC")) {
			System.out.println("Creating JDBC Object");
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equalsIgnoreCase("hibernate")) {
			System.out.println("Creating JPA With Hibernate Object");
			dao = new EmployeeDAOJPAIMPL();
		} else {
			System.out.println("Creating SpringJDBC Object");
			dao = new EmployeeDAOSRINGJDBCIMPL();
		}
		return dao;
	}// End Of the Method
}// End Of the Class
