package servlet;

import java.io.IOException;

import implimentation_DAO.EmployDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployDaoImp em;

	public void init() throws ServletException {
    	em = new EmployDaoImp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
