package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Account;

public class HomeDAO {
public static List<Account> DisplayAccount(Connection conn){
		
		List<Account> list = new ArrayList<Account>();
		PreparedStatement ps = null;
		String sql = "select * from account";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()){
				String uname = rs.getString("uname");
				String pass = rs.getString("pass");
				
				Account acc = new Account();
				acc.setUname(uname);
				acc.setPass(pass);
				
				
				list.add(acc);
			}
			ps.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
