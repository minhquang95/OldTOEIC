package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Bean.Account;
import java.sql.*;
public class RegisterDAO {
	public static boolean InsertAccount(Connection conn, Account acc){
		
		PreparedStatement ps = null;
		String sql = "insert into account(uname,pass) values (?,?)";
		try {
			ps = conn.prepareStatement(sql);
			String pass = acc.getPass();
			String uname = acc.getUname();
			ps.setString(1, uname);
			ps.setString(2,pass);
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
