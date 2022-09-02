package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.Category;
import implimentation_DAO.Category_DAO;

import java.io.IOException;


public class Category_Sevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Category_Sevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Category category = new Category();
			category.setID_Category(Integer.parseInt(request.getParameter("id")));
			category.setName(request.getParameter("CategoryName"));

			Category_DAO DAO_category = new Category_DAO();
			DAO_category.Ajouter(category);

			
			request.getRequestDispatcher("Task.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
