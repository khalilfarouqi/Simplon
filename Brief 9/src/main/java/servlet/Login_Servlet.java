package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Users;

import java.io.IOException;

import implimentation_DAO.Users_DAO;


public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Users users = new Users();
			Users_DAO DAO_users = new Users_DAO();
			
			DAO_users.test_Connection(users, request.getParameter("User_Name"), request.getParameter("User_PassWord"));
			
			if (users.getFirst_Name() != null) request.getRequestDispatcher("Task.jsp").forward(request, response);
			else request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+" lafan");
		}
		
	}

}
