package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.CommentList;
import DAO.CommentDAO;
import DB.DBConnection;

@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CommentController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String content = request.getParameter("content");
		
		String username = request.getParameter("username");
		CommentList cl = new CommentList();
		cl.setContent(content);
		cl.setUsername(username);
		Connection conn = DBConnection.CreateConnection();
		
		CommentDAO.InsertComment(conn, cl);
		
		List<CommentList> list = CommentDAO.DisplayComment(conn);
		request.setAttribute("listcomment", list);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("View/DisplayComent.jsp");
		rd1.forward(request, response);
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
