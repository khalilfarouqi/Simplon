package servlet;

import java.io.IOException;
import java.util.List;

import implimentation_DAO.EmployDaoImp;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employe;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployDaoImp em;

	public void init() throws ServletException {
    	em = new EmployDaoImp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employe> listEmp = em.listElemts();
        request.setAttribute("listEmp", listEmp);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/EmployeList.html");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
