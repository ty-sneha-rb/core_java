package com.tyss.designpattern.service;

import java.util.List;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public interface EmployeeService {

	public EmployeePrimaryInfo getDetaillByEmployeeID(int emp_id);
	public boolean deleteByEmployeeID(int emp_id);
	public boolean createEmployeeDetail(EmployeePrimaryInfo info);
	public boolean updateEmployeeDetail(EmployeePrimaryInfo info);

	public List<EmployeePrimaryInfo> getAllDetailEmployee();
}
