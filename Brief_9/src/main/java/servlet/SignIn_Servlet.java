package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Users;

import java.io.IOException;

import implimentation_DAO.Users_DAO;

public class SignIn_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignIn_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Users users = new Users();
			Users_DAO DAO_users = new Users_DAO();

			users.setID_User(Integer.parseInt(request.getParameter("id")));
			users.setFirst_Name(request.getParameter("FirstName"));
			users.setLast_Name(request.getParameter("LastName"));
			users.setUser_Name(request.getParameter("user"));
			users.setUser_PassWord(request.getParameter("Password"));

			DAO_users.Ajouter(users);

			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
