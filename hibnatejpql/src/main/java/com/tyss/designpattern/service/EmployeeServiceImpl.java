package com.tyss.designpattern.service;

import java.util.List;

import com.tyss.designpattern.dao.EmployeeDAOFactory;
import com.tyss.designpattern.dao.EmpolyeeDAO;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeServiceImpl implements EmployeeService{

	EmpolyeeDAO dao =EmployeeDAOFactory.getInstance();

	
	public EmployeePrimaryInfo getDetaillByEmployeeID(int emp_id) {
		if (emp_id != 0) {
			return dao.getDetaillByEmployeeID(emp_id);
		}
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean deleteByEmployeeID(int emp_id) {
		if(emp_id!=0) {
			return dao.deleteByEmployeeID(emp_id);
		}
		return false;
	}

	
	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		if(info !=null) {
			return dao.createEmployeeDetail(info);
		}
		return false;
	}

	
	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		if(info !=null) {
			return dao.updateEmployeeDetail(info);
		}
		return false;
	}

	
	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		if (dao != null) {
			return dao.getAllDetailEmployee();
		}
		return null;
	}



	
}
