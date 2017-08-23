package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;

import DB.DBConnection;

public class RegisterDAO {
	public static void InsertAccount(Connection conn , Account){
		PreparedStatement ps = null;
		String sql = "insert into acccount(uname,pass) values (?,?)";
		try {
			ps = (PreparedStatement) conn.prepareStatement(sql);
			String uname = acc.
			int kt = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
