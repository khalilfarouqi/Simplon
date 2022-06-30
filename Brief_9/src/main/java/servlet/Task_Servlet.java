package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

import models.*;
import implimentation_DAO.*;

public class Task_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Task task = new Task();
			task.setID_task(Integer.parseInt(request.getParameter("id")));
			task.setTitle(request.getParameter("title"));
			task.setDescription(request.getParameter("Description"));
			task.setStatus(request.getParameter("Status"));
			task.setDeadline(LocalDate.parse(request.getParameter("DeadLine")));
			task.setID_Category(Integer.parseInt(request.getParameter("Categoryid")));

			Task_DAO DAO_task = new Task_DAO();
			DAO_task.Ajouter(task);

			
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
