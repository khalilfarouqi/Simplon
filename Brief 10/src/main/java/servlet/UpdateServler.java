package servlet;

import java.io.IOException;

import implimentation_DAO.EmployDaoImp;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employe;

public class UpdateServler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployDaoImp em;
	private Employe employe;

	public void init() throws ServletException { 
    	em = new EmployDaoImp();
    	employe = new Employe();
//    	employe = em.getElemts(8);
//    	System.out.println(employe.toString());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		employe = em.getElemts(6);
//      e.setPrenom("bienvenu");
		
//		Long id = Long.parseLong(request.getParameter("id"));
		employe = em.getElemts(8);
		
		System.out.println(employe.toString());
		
        RequestDispatcher dispacher = request.getRequestDispatcher("/EmployeList.html");
        request.setAttribute("Emplye", employe);
        dispacher.forward(request, response);
        
		String Prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		Double salaire = Double.parseDouble(request.getParameter("salaire"));
		String post = request.getParameter("post");
		String typecont = request.getParameter("typeCont");
		
		em.updateElemts(new Employe(8,Prenom, nom, salaire, post, typecont));

		response.sendRedirect("EmployeList.html");
		
	}

}
