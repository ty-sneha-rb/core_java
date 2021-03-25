package com.tyss.designpattern.test;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
import com.tyss.designpattern.service.EmployeeService;
import com.tyss.designpattern.service.EmployeeServiceImpl;


public class TestDao {
	public static void main(String[] args) {
		// EmployeeDAOJDBCImpl jdbc = new EmployeeDAOJDBCImpl();
		// EmployeeDAO dao = new EmployeeDAOJPAIMPL();

		// EmployeeDAO dao = new EmployeeDAOSRINGJDBCIMPL();
		// EmployeePrimaryInfo empInfo = dao.getDetaillByEmployeeID(1);

		//EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		
//		EmployeeService service=new EmployeeServiceImpl();
//		EmployeePrimaryInfo empinfo = service.getDetaillByEmployeeID(105);
//// single result
//		System.out.println("====================================");
//		System.out.println("Id " + empinfo.getEmp_id());
//		System.out.println("EmployeeName " + empinfo.getName());
//		System.out.println("departmentId " + empinfo.getDepartmentId());
//		System.out.println("age " + empinfo.getAge());
//		System.out.println("email "+ empinfo.getEmail());
//		System.out.println("gender "+empinfo.getGender());
//		System.out.println("government id"+empinfo.getGovId());
//		System.out.println("************");
 
//		// update operation
//				EmployeePrimaryInfo emp = new EmployeePrimaryInfo();
//				emp.setEmp_id(108);
//				emp.setName("dada");
//				EmployeeService service1 = new EmployeeServiceImpl();
//				boolean val = service1.updateEmployeeDetail(emp);
//				System.out.println(val);
//
//		
//		// delete operation
//				EmployeeService service3 = new EmployeeServiceImpl();
//				boolean val1 = service3.deleteByEmployeeID(105);
//				System.out.println(val1);
//				
				// getting all records
				EmployeeService service4 = (EmployeeService) new EmployeeServiceImpl();
				List<EmployeePrimaryInfo> emps = service4.getAllDetailEmployee();
				for (EmployeePrimaryInfo emp1 : emps) {
					System.out.println("Id " +emp1.getEmp_id());
					System.out.println("EmployeeName " + emp1.getName());
					System.out.println("departmentId " + emp1.getDepartmentId());
					System.out.println("age " + emp1.getAge());
					System.out.println("email "+ emp1.getEmail());
					System.out.println("gender "+emp1.getGender());
					System.out.println("government id"+emp1.getGovId());
	}

}
}