package servlet;

import java.io.IOException;

import org.hibernate.Session;

import connexion.HibernateUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
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

//		Implimentation_Admin admin_Imp = new Implimentation_Admin();
		
		System.out.println(request.getParameter("User_Name"));
		System.out.println(request.getParameter("User_PassWord"));
//		System.out.println(admin_Imp.lister_One(request.getParameter("User_Name"), Integer.parseInt(request.getParameter("User_PassWord"))));
//		
		if (request.getParameter("User_Name").equals("Admin") && request.getParameter("User_PassWord").equals("Admin")) {
			response.sendRedirect("Home.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}

		HibernateUtil.getSessionFactory().close();
	}

}
