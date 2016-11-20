package com.naveen;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public List<Emp> getEmps(String name) {
		GetConnection gc = new GetConnection();
		String sql = "select empid, empname, empsal, empemail from emp "
				+ "where empname like '%" + name + "%'";

		ArrayList<Emp> emps = null;
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			emps = new ArrayList<Emp>();
			while (gc.rs.next()) {
				emps.add(new Emp(gc.rs.getInt(1), gc.rs.getString(2), gc.rs.getDouble(3), gc.rs.getString(4)));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}
}
