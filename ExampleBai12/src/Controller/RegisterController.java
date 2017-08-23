package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Account;
import DAO.RegisterDAO;
import DB.DBConnection;

import java.sql.*;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			
			Account acc = new Account();
			acc.setUname(uname);
			acc.setPass(pass);
			boolean kt = RegisterDAO.InsertAccount(conn, acc);
			
			if(kt){

				try {
					request.setAttribute("msgregister", "Register Success");
					RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
					rd.forward(request, response);	
					
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				request.setAttribute("msgregister", "Register Failed");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
				rd.forward(request, response);	
			}
	}

}
