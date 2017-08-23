package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import Bean.Incompletesentence;
import DAO.QuizDAO;
import DB.DBConnection;
import java.sql.*;
import java.util.*;
@WebServlet("/ForwardView")
public class QuizForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public QuizForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = (Connection) DBConnection.CreateConnection();
		
		List<Incompletesentence> list = QuizDAO.DisplayQuestion(conn);
		
		request.setAttribute("listincomplete", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/View.jsp");
		rd.forward(request, response);
				
	}



}
