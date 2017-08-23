package Sever;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	
   		String name = request.getParameter("username");
   		String password = request.getParameter("password");
		Source s = new Source();
		s.setName(name);
		s.setPassword(password);
		Process process = new Process();
		boolean kt = process.Check(name, password);
		if (kt){
			
			HttpSession session = request.getSession(true);
			session.setAttribute("sessionname", name);
			String msg1 = "Login Success ";
			
			request.setAttribute("message", msg1);
			RequestDispatcher rd1 = request.getRequestDispatcher("Home.jsp");
			rd1.forward(request, response);
		} else {
			request.setAttribute("msg", "Login Failed");
			RequestDispatcher rd1 = request.getRequestDispatcher("/Login2.jsp");
			rd1.forward(request, response);
		} 
		
//			
		}	

}
