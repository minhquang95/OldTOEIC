package DB;
import java.sql.*;
public class DBConnection {
	public static Connection CreateConnection(){
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/examplebai11";
		String name = "root";
		String password = "quang";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, name, password);
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
	}
}
