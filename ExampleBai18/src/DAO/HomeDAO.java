package DAO;

import java.awt.List;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.sql.*;

import Bean.Add;

public class HomeDAO {
	public static void ImportExcel(HttpServletRequest request, HttpServletResponse response, Connection conn) throws ServletException, IOException{
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("D://test.xls");
			HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(fis));
			
			 Sheet sheet = wb.getSheetAt(0);
			 
			 for(int i = 1 ; i<=sheet.getLastRowNum();i++){
				 Row row = sheet.getRow(i);
				 
				 int stt = (int) row.getCell(0).getNumericCellValue();
				 
				 String question = row.getCell(1).getStringCellValue();
				 
				 String option1 = row.getCell(2).getStringCellValue();
				 
				 String option2 = row.getCell(3).getStringCellValue();
				 
				 String option3 = row.getCell(4).getStringCellValue();
				 
				 String option4 = row.getCell(5).getStringCellValue();

				 String correctans = row.getCell(6).getStringCellValue();
				 
				 
				 Add add = new Add();
				 add.setStt(stt);
				 add.setQuestion(question);
				 add.setOption1(option1);
				 add.setOption2(option2);
				 add.setOption3(option3);
				 add.setOption4(option4);
				 add.setCorrectans(correctans);
				 
				 HomeDAO.InsertData(add, conn, request);
			 }
			 wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("View/Result.jsp");
		rd.forward(request, response);
		
	}
	public static void InsertData(Add add , Connection conn, HttpServletRequest request){
		String sql = "insert into quesans(stt,question,option1,option2,option3,option4,correctans) values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,add.getStt());
			ps.setString(2,add.getQuestion());
			ps.setString(3,add.getOption1());
			ps.setString(4,add.getOption2());
			ps.setString(5,add.getOption3());
			ps.setString(6,add.getOption4());
			ps.setString(7,add.getCorrectans());
			int kt = ps.executeUpdate();
			if(kt!=0){
				request.setAttribute("message", "insert data from excel to DB Success");
			}else{
				request.setAttribute("message", "insert data from excel to DB Failed");
			}
			ps.close();
			
		} catch (SQLException e) {
			request.setAttribute("message", e.getMessage());
		}
	}
}	
