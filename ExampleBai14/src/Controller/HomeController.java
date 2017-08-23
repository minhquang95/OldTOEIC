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

import Bean.Province;
import Bean.Student;
import DAO.HomeDAO;
import DB.DBConnection;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		String uname = request.getParameter("studentname");
		String provinceidstr = request.getParameter("dropdownprovince");
		
		int provinceid = Integer.parseInt(provinceidstr);
		Student student = new Student();
		student.setStudentname(uname);
		student.setProvinceid(provinceid);
		
		boolean kt = HomeDAO.InsertStudent(conn, student);
		if (kt){
			request.setAttribute("msginsertstudent", "Insert Success");
			List<Province> list = HomeDAO.DisplayProvince(conn);
			request.setAttribute("listprovince", list);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);

			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("msginsertstudent", "Insert Failed");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}
		
	}

}
