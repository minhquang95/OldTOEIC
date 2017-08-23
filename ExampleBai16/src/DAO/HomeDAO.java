package DAO;
import java.util.*;

import Bean.Emp;
import java.sql.*;
public class HomeDAO {
	public static List<Emp> DisplayEmp(int start, int count , Connection conn){
		List<Emp> list = new ArrayList<Emp>();
		String sql = "SELECT * FROM emp LIMIT "+ (start-1) +", " +count+ "";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Emp emp = new Emp();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				float salary = rs.getFloat("salary");
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				
				int id1 = emp.getId();
				String name1 = emp.getName();
				float salary1 = emp.getSalary();
				
				list.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
}
