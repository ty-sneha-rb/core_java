package com.tyss.designpattern.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeDAOJDBCImpl implements EmpolyeeDAO {

	
	public EmployeePrimaryInfo getDetaillByEmployeeID(int emp_id)
			 {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1.Load The Driver

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2.Get the "DB Connection" via "Driver"
			/*
			 * String dbURL = "jdbc:mysql://localhost:3306/" +
			 * "ems_db?user=root&password=root";
			 */
//				conn = DriverManager.getConnection(dbURL);

			String dbURL = "jdbc:mysql://localhost:3306/ems_db";
			conn = DriverManager.getConnection(dbURL, "root", "root");

			// 3.Issue "SQL Queries" via "Connection"
			String query = "select * from employeeprimaryinfo where empId=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, emp_id);
			rs = pstmt.executeQuery();
			EmployeePrimaryInfo record = new EmployeePrimaryInfo();
			// 4."Process the Results" returned by "SQL Queries"
			if (rs.next()) {
				record.setAge(rs.getInt("age"));
				record.setDateofbirth(rs.getDate("d_o_b"));
				record.setDate_of_joining(rs.getDate("date_of_joining"));
				record.setDepartmentId(rs.getInt("dept_id"));
				record.setEmail(rs.getString("email"));
				record.setEmp_id(rs.getInt("emp_id"));
				record.setGovId(rs.getInt("gov_id"));
				record.setMobileno(rs.getInt("mobileno"));
				record.setName(rs.getString("name"));
				record.setSalary(rs.getInt("salary"));
				record.setStatus(rs.getString("status"));
				return record;

			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			// 5.close All the JDBC Object
			try {
				if (conn != null) {
					conn.close();

				} // End Of If block
				if (pstmt != null) {
					pstmt.close();

				} // End Of If block
				if (rs != null) {
					rs.close();

				} // End Of If block
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // End Of The inner catch block

		} // End Of The Finally

	}// End Of The GetDetailByID

	@Override
	public boolean deleteByEmployeeID(int emp_id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String URL = "jdbc:mysql://localhost:3306/tys_db?user=root&password=root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL);
			String query = "delete from employee_info where eID=" + emp_id;
			stmt = con.createStatement();
			int res = stmt.executeUpdate(query);
			if (res != 0) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}//End Of The Class

