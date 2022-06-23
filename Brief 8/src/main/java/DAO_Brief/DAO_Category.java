package DAO_Brief;

import Models.Category;
import Models.Connect;
import Models.Message_Box;
import javafx.collections.ObservableList;

import java.sql.ResultSet;

public class DAO_Category implements DAO<Category> {

    Message_Box Msg_Box = new Message_Box();

    @Override
    public void Ajouter(Category category) {

    }

    @Override
    public void supprimer(Category category) {

    }

    @Override
    public void modifier(Category category) {

    }

    @Override
    public void lister(Category category) {

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
