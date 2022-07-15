package implimentation_DAO;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import connexion.Connect;
import dao.*;
import models.*;

public class Task_DAO  implements IDAO<Task>{
	
	String sql;

	@Override
	public void Ajouter(Task task) {
		try {
			
			PreparedStatement ps = Connect.connexion().prepareStatement("Insert into Task values (?,?,?,?,?,?)");
			 
			ps.setInt(1, task.getID_task());
			ps.setString(2, task.getTitle());
			ps.setString(3, task.getDescription());
			ps.setString(4, task.getStatus());
			ps.setDate(5, Date.valueOf(task.getDeadline()));
			ps.setInt(6, task.getID_Category());

			ps.execute();

			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void supprimer(Task task) {
		try {
			sql = "DELETE FROM task WHERE id_task = " + task.getID_task();

            PreparedStatement ps = Connect.connexion().prepareStatement(sql);
            ps.execute();
            ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void modifier(Task task) {
		try {
			
			sql = "UPDATE Task SET title = '"+ task.getTitle() +"',description = '"+ task.getDescription()
            +"',status = '" + task.getStatus() + "',deadline = '"+ task.getDeadline() +"',id_category = "+ task.getID_Category()
            + "WHERE id_task = " + task.getID_task();


		    PreparedStatement ps = Connect.connexion().prepareStatement(sql);
		
		    ps.execute();
		
		    Connect.connexion().commit();
		    ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void lister(Task task) {
		try {
			sql = "Select max(id_task) from task";

            Statement stat = (Statement) Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
                task.setID_task(ResSet.getInt("max") + 1);
            }

            ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Task> afficher(Task task) {
		List<Task> tasks = new ArrayList<>();
		try {
			sql = "Select * from task";

            Statement stat = (Statement) Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
            	task.setID_task(ResSet.getInt("id_task"));
            	task.setTitle(ResSet.getString("title"));
            	task.setDescription(ResSet.getString("description"));
            	task.setStatus(ResSet.getString("status"));
            	task.setDeadline(ResSet.getString("deadline"));
            	task.setID_task(ResSet.getInt("id_category"));
            }
            
            tasks.add(task);
            
            ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return tasks;
	}


}
