package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import Bean.Employee;

public class SearchDAO {
// thÃªm dá»¯ liá»‡u vÃ o mysql
// hiá»ƒn thi dá»¯ liá»‡u vÃ o mysql	
	
	
public static List<Employee> DisplayResult(Connection conn, HttpServletRequest request, String name1){
		
		List<Employee> list = new ArrayList<Employee>();
		String sql = "select * from employee where name like'"+name1+"%'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(!rs.isBeforeFirst()){
				request.setAttribute("ketqua", "Không có kết quả");
			} else{
			while (rs.next()){
				Employee em = new Employee();
				String name = rs.getString("name");
				em.setName(name);
				list.add(em);
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
