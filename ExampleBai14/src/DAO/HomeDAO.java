	package DAO;
import java.util.*;


import Bean.Province;
import Bean.Student;

import java.sql.*;
public class HomeDAO {
	public static List<Province> DisplayProvince (Connection conn){
		
		List<Province> list = new ArrayList<Province>();
		String sql = "select * from province";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int provinceid = rs.getInt("provinceid");
				String provincename = rs.getString("provincename");
				
				
				Province province = new Province();
				province.setProvinceid(provinceid);
				province.setProvincename(provincename);
				list.add(province);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static boolean InsertStudent(Connection conn, Student student){
		
		PreparedStatement ps = null;
		String sql = "insert into student(studentname,provinceid) values (?,?)";
		try {
			ps = conn.prepareStatement(sql);
			String studentname = student.getStudentname();;
			int provinceid = student.getProvinceid();
			ps.setString(1, studentname);
			ps.setInt(2, provinceid);
			int kt = ps.executeUpdate();
			
			if (kt !=0){
				return true;
			} 
			
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	
}
