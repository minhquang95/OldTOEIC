package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DBConnection;

import java.sql.*;
/**
 * Servlet implementation class TestConnectionController
 */
@WebServlet("/TestConnectionController")
public class TestConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public TestConnectionController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		PrintWriter out = response.getWriter();
		if(conn != null) {
			out.println("<h1>Connection Success</h1>");
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			out.println("<h1>Connection Failed</h1>");
			
		}
	}

}
