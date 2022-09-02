package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import models.*;
import implimentation_DAO.*;

public class Users_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Users_Servlet() {
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
			
			DAO_users.Ajouter(users);
			
			users.setFirst_Name(request.getParameter("First_Name"));
			users.setLast_Name(request.getParameter("Last_Name"));
			users.setUser_Name(request.getParameter("User_Name"));
			users.setUser_PassWord(request.getParameter("User_PassWord"));

			DAO_users.Ajouter(users);

			
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
