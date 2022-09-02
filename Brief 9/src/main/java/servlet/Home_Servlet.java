package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.*;
import implimentation_DAO.*;

import java.io.IOException;
import java.util.List;


public class Home_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Home_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Task task = new Task();
		Task_DAO task_DAO = new Task_DAO();
		task_DAO.afficher(task);

		List<Task> listTask = task_DAO.afficher(task);
		System.out.println(task_DAO.list.toString());

		request.setAttribute("ID_Task", task.getID_task());
		request.setAttribute("Title", task.getTitle());
		request.setAttribute("Disc", task.getDescription());
		request.setAttribute("Status", task.getStatus());
		request.setAttribute("DeadLine", task.getDeadline());
		request.setAttribute("ID_Cate", task.getID_Category());
		
		request.setAttribute("listTask", listTask);
		
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

}
