package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AnswerUser;
import Bean.Incompletesentence;
import DAO.QuizDAO;
import DB.DBConnection;

import java.sql.*;
import java.util.*;
@WebServlet("/QuizController")
public class QuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QuizController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection conn = DBConnection.CreateConnection();
		int countrow = QuizDAO.GetCountRow(conn);
		
		List<Incompletesentence> ListCorrectAnswer = QuizDAO.Getcorrectanswer(conn);
		List<AnswerUser> ListanswerUser = new ArrayList<AnswerUser>();
		
		for(int i = 1 ; i<=countrow ; i++)
		{
			String answer = request.getParameter("ans["+i+"]");
			if(answer != null)
			{
				AnswerUser au = new AnswerUser();
				au.setNumber(i);
				au.setAnswer(answer);
			
				ListanswerUser.add(au);
			} 
			else 
			{
				request.setAttribute("msg", "Yêu Cầu Làm Hết Câu Hỏi");
				List<Incompletesentence> list = QuizDAO.DisplayQuestion(conn);
				
				request.setAttribute("listincomplete", list);
				
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/View.jsp");
				rd.forward(request, response);
			}
		}
		
		request.setAttribute("ListCorrectAnswer", ListCorrectAnswer);
		request.setAttribute("ListanswerUser", ListanswerUser);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/View/Result.jsp");
		rd1.forward(request, response);
		
	}
	
	

}
