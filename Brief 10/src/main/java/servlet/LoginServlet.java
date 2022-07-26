package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import implimentation_DAO.*;
import model.*;

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
		// TODO Auto-generated method stub
//		doGet(request, response);
		try {
			Admin admin = new Admin();
			AdminDaoImp adminDaoImp = new AdminDaoImp();
			
//			adminDaoImp.getElemts();
//			
//			adminDaoImp.test_Connection(users, request.getParameter("User_Name"), request.getParameter("User_PassWord"));
//			
//			if (users.getFirst_Name() != null) request.getRequestDispatcher("Task.jsp").forward(request, response);
//			else request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" lafan");
		}
	}

}
