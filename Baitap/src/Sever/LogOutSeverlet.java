package Sever;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogOutSeverlet")
public class LogOutSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogOutSeverlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.removeAttribute("sessionname");
		RequestDispatcher rd1 = request.getRequestDispatcher("/Login2.jsp");
		rd1.forward(request, response);
	}

}
