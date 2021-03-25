package com.tyss.designpattern.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column(name="emp_id")
	private int emp_id;
	@Column(name= "name")
	private String name;
	@Column(name="dept_id")
	private int departmentId;
	@Column(name="gov_id")
	private int govId;
	@Column(name="email")
	private String email;
	@Column(name="salary")
	private double salary;
	@Column(name="date_of_joining")
	private Date date_of_joining;
	@Column(name="d_o_b")
	private Date dateofbirth;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private char gender;
	@Column(name="status")
	private String status;
	@Column(name="mobileno")
	private int mobileno;
}
