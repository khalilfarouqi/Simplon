package DAO_Brief;

import Models.Category;
import Models.Connect;
import Models.Message_Box;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO_Category implements DAO<Category> {

    Message_Box Msg_Box = new Message_Box();

    @Override
    public void Ajouter(Category category) {
        try {
            PreparedStatement ps = Connect.connexion().prepareStatement("Insert into Category values (?,?)");

            ps.setInt(1, category.getID_Category());
            ps.setString(2, category.getName());

            ps.execute();

            ps.close();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Create DAO_Category");
        }
    }

    @Override
    public void supprimer(Category category) {
        try {
            PreparedStatement ps = Connect.connexion().prepareStatement("DELETE FROM Category WHERE ID_Category = " + category.getID_Category());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            Msg_Box.message_box(e,"Delete DAO_Category");
        }
    }

    @Override
    public void modifier(Category category) {
        try {

            String sql = "UPDATE Category SET Name = '" + category.getName() + "WHERE ID_Category = " + category.getID_Category();


            PreparedStatement ps = Connect.connexion().prepareStatement(sql);

            ps.execute();

            Connect.connexion().commit();
            ps.close();
        }catch (Exception e) {
            Msg_Box.message_box(e,"Update DAO_Category");
        }
    }

    @Override
    public void lister(Category category) {
        try {
            String sql = "Select max(ID_Category) from Category";

            Statement stat = (Statement) Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
                category.setID_Category(ResSet.getInt("max") + 1);
            }

            ResSet.close();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Read DAO_Candidat");
        }
    }

    public void Remp_Combobox(Category category, ObservableList<Category> candidatList) {
        try {
            ResultSet rs = Connect.connexion().createStatement().executeQuery("select * from category");
            while(rs.next()){

                category = new Category(rs.getInt("id_category"),rs.getString("name"));

                candidatList.add(category);
            }
        } catch (Exception e) {
            // TODO: handle exception
            Msg_Box.message_box(e, "Remplir ObservableList");
        }

    }
}
