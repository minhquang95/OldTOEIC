package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Province;
import DAO.HomeDAO;
import DB.DBConnection;

//import Bean.Account;
//import DAO.HomeDAO;
//import DB.DBConnection;

import java.sql.*;
import java.util.*;
/**
 * Servlet implementation class HomeForward
 */
@WebServlet("/HomeForward")
public class HomeForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeForward() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Connection conn = DBConnection.CreateConnection();
//		List<Account> list = HomeDAO.DisplayAccount(conn);
		
//		request.setAttribute("listaccount", list);
		Connection conn = DBConnection.CreateConnection();
		List<Province> list = HomeDAO.DisplayProvince(conn);
		request.setAttribute("listprovince", list);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
		rd.forward(request, response);
	}



}
