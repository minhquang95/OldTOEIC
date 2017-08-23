package Sever;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class ImageShow
 */
@WebServlet("/ImageShow")
public class ImageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
        String password = request.getParameter("password");
		Process process = new Process();
		boolean kt1 = process.CheckImage(name, password);
		if (kt1){
			RequestDispatcher rd1 = request.getRequestDispatcher("/Ngoc.jsp");
			rd1.forward(request, response);
		
		} else {
			RequestDispatcher rd1 = request.getRequestDispatcher("/Login2.jsp");
			rd1.forward(request, response);
		}
	

	
//	public static void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("/Login2.jsp");
//		rd.forward(request, response);
//		String name = request.getParameter("username");
//   	String password = request.getParameter("password");
//		Process process = new Process();
//		boolean kt = process.Check(name, password);
//		if (kt){
//			RequestDispatcher rd1 = request.getRequestDispatcher("/Ngoc.jsp");
//			rd1.forward(request, response);
//		
//		} else {
//			RequestDispatcher rd1 = request.getRequestDispatcher("/Login2.jsp");
//			rd1.forward(request, response);
//		}

	}
}
