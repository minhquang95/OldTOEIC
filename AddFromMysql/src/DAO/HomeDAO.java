package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import Bean.Users;

public class HomeDAO {
	public static void ImportExcel(HttpServletRequest request, HttpServletResponse response, Connection conn) throws ServletException, IOException, SQLException
	{
		POIFSFileSystem fileSystem;
		FileInputStream fis;
		
		try {
			FileInputStream input = new FileInputStream("E:\\test.xls");
            POIFSFileSystem fs = new POIFSFileSystem( input );
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
            for(int i=1; i<=sheet.getLastRowNum(); i++){
                row = sheet.getRow(i);
                int stt = (int) row.getCell(0).getNumericCellValue();
                String username = row.getCell(1).getStringCellValue();
                int password	 = (int) row.getCell(2).getNumericCellValue();
                
                Users users = new Users();
                users.setStt(stt);
                users.setUsername(username);
                users.setPassword(password);
                
                	HomeDAO.InsertData(users, conn, request, response);
    			}
    			
            
            
			
            
              input.close();
			  wb.close();
		} catch (FileNotFoundException e ) {
			request.setAttribute("msg", e.getMessage());
		} catch (IOException e) {
			request.setAttribute("msg", e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
		rd.forward(request, response);
		
	}
	
	public static void InsertData(Users users , Connection conn, HttpServletRequest request, HttpServletResponse response)
	{
		String sql = "insert into users(stt,username,password) values (?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,users.getStt());
			ps.setString(2,users.getUsername());
			ps.setInt(3,users.getPassword());
			int kt  = ps.executeUpdate();
			if (kt != 0)
			{
				request.setAttribute("msg", " Thêm Thành Công");
			}else 
			{
				request.setAttribute("msg", "Thêm Không Thành Công ");
			}
			ps.close();
		} catch (SQLException e) {
			request.setAttribute("msg", e.getMessage());
		}
	}

}
