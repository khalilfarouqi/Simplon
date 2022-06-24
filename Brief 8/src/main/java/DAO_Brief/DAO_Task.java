package DAO_Brief;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import DAO_Brief.DAO;
import Models.*;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class DAO_Task implements DAO<Task> {

    private Message_Box Msg_Box = new Message_Box();
    private String sql;

    public void Ajouter(Task task) {
        // TODO Auto-generated method stub
        try {

            PreparedStatement ps = Connect.connexion().prepareStatement("Insert into Task values (?,?,?,?,?,?)");

            ps.setInt(1, task.getID_task());
            ps.setString(2, task.getTitle());
            ps.setString(3, task.getDescription());
            ps.setString(4, task.getStatus());
            ps.setDate(5, java.sql.Date.valueOf(task.getDeadline()));
            ps.setInt(6, task.getID_Category());

            ps.execute();

            ps.close();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Ajouter DAO_Task");
        }
    }


    public void supprimer(Task task) {
        // TODO Auto-generated method stub
        try {
            sql = "DELETE FROM task WHERE id_task = " + task.getID_task();

            PreparedStatement ps = Connect.connexion().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (Exception e) {
            Msg_Box.message_box(e,"Delete DAO_task");
        }
    }


    public void modifier(Task task) {
        // TODO Auto-generated method stub
        try {

            sql = "UPDATE Task SET title = '"+ task.getTitle() +"',description = '"+ task.getDescription()
                    +"',status = '" + task.getStatus() + "',deadline = '"+ task.getDeadline() +"',id_category = "+ task.getID_Category()
                    + "WHERE id_task = " + task.getID_task();


            PreparedStatement ps = Connect.connexion().prepareStatement(sql);

            ps.execute();

            Connect.connexion().commit();
            ps.close();
        }catch (Exception e) {
            Msg_Box.message_box(e,"Update DAO_Task");
        }
    }


    public void lister(Task task) {
        // TODO Auto-generated method stub
        try {
            sql = "Select max(id_task) from task";

            Statement stat = (Statement) Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
                task.setID_task(ResSet.getInt("max") + 1);
            }

            ResSet.close();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Read DAO_Candidat");
        }
    }
    public void Remp_Observe(Task task,ObservableList<Task> candidatList) {
        try {
            ResultSet rs = Connect.connexion().createStatement().executeQuery("select * from task");
            while(rs.next()){

                task = new Task(rs.getInt("id_task"),rs.getString("title"),rs.getString("description"),
                        rs.getString("status"),rs.getString("deadline"),rs.getInt("id_category"));

                candidatList.add(task);
            }
        } catch (Exception e) {
            Msg_Box.message_box(e, "Remplir ObservableList");
        }

    }
}
