package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.CommentList;

public class CommentDAO {
// thêm dữ liệu vào mysql
	public static void InsertComment(Connection conn, CommentList cl){
		PreparedStatement ps = null;
		String sql = "insert into comment(content,username) values (?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			String content = cl.getContent();
			String username = cl.getUsername();
			
			ps.setString(1, content);
			ps.setString(2, username);
			ps.executeUpdate();
	
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	
	
// hiển thi dữ liệu vào mysql	
	
	
public static List<CommentList> DisplayComment(Connection conn){
		
		List<CommentList> list = new ArrayList<CommentList>();
		PreparedStatement ps = null;
		String sql = "select * from comment";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()){
				
				String content = rs.getString("content");
				String username = rs.getString("username");
				CommentList cl = new CommentList();
	
				cl.setContent(content);
				cl.setUsername(username);
				
				
				list.add(cl);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
