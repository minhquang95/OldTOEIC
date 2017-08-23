package DAO;
import java.sql.*;
import java.util.*;

import Bean.Incompletesentence;
public class QuizDAO {
	public static List<Incompletesentence> DisplayQuestion(Connection conn){
		List<Incompletesentence> list = new ArrayList<Incompletesentence>();
		
		String sql = "select * from incomepletesentence";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int number = rs.getInt("number");
				String question = rs.getString("question");
				String option1 = rs.getString("option1");
				String option2 = rs.getString("option2");
				String option3 = rs.getString("option3");
				String option4 = rs.getString("option4");
				String correctanswer = rs.getString("correctanswer");
				
				Incompletesentence ipt = new Incompletesentence();
				
				ipt.setNumber(number);
				ipt.setQuestion(question);
				ipt.setOption1(option1);
				ipt.setOption2(option2);
				ipt.setOption3(option3);
				ipt.setOption4(option4);
				ipt.setCorrectanswer(correctanswer);
				
				list.add(ipt);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static List<Incompletesentence> Getcorrectanswer(Connection conn){
		List<Incompletesentence> list = new ArrayList<Incompletesentence>();
		
		String sql = "select * from incomepletesentence";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				int number = rs.getInt("number");
				String question = rs.getString("question");
				String option1 = rs.getString("option1");
				String option2 = rs.getString("option2");
				String option3 = rs.getString("option3");
				String option4 = rs.getString("option4");
				String correctanswer = rs.getString("correctanswer");
				
				Incompletesentence ipt = new Incompletesentence();
				
				ipt.setNumber(number);
				ipt.setQuestion(question);
				ipt.setOption1(option1);
				ipt.setOption2(option2);
				ipt.setOption3(option3);
				ipt.setOption4(option4);
				ipt.setCorrectanswer(correctanswer);
				
				list.add(ipt);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public static int GetCountRow(Connection conn){
		int count = 0;
		String sql = "select count(*) from incomepletesentence";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			count = rs.getInt(1);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
		
	}
	
}
