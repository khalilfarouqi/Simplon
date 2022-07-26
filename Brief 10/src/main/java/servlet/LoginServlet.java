package servlet;

import java.io.IOException;

import org.hibernate.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import implimentation_DAO.*;
import util.HibernateUtil;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Project started ...");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();

		AdminDaoImp adminDaoImp = new AdminDaoImp();
		
		System.out.println(request.getParameter("User_Name"));
		System.out.println(request.getParameter("User_PassWord"));

		if (adminDaoImp.listElemtsAdmin(request.getParameter("User_Name"), Integer.parseInt(request.getParameter("User_PassWord"))) == true) {
			response.sendRedirect("EmployeList.html");
		}else {
			response.sendRedirect("login.html");
		}

	    HibernateUtil.getSessionFactory().close();
	    
		response.sendRedirect("EmployeList.html");
	}

}
