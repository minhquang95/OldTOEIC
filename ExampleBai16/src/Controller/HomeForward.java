package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Emp;
import DAO.HomeDAO;
import DB.DBConnection;

import java.util.*;
import java.sql.*;

@WebServlet("/HomeForward")
public class HomeForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageidstr = request.getParameter("pageid");
		int count = 4;
		int pageid = Integer.parseInt(pageidstr);
		if(pageid ==1){
			
		}else{
			pageid = pageid-1;
			pageid = pageid * count + 1;
			
		}
		Connection conn = DBConnection.CreateConnection();
		List<Emp> list = HomeDAO.DisplayEmp(pageid, count, conn);
		
		request.setAttribute("listemp", list);
		request.setAttribute("numberpage",Integer.parseInt(pageidstr));
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
		rd.forward(request, response);
	}
	

}
