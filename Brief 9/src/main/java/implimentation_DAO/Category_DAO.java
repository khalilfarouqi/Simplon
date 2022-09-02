package implimentation_DAO;

import java.sql.*;

import connexion.*;
import dao.*;
import models.*;

public class Category_DAO implements IDAO<Category> {

	@Override
	public void Ajouter(Category category) {
        try {
            PreparedStatement ps = Connect.connexion().prepareStatement("Insert into Category values (?,?)");

            ps.setInt(1, category.getID_Category());
            ps.setString(2, category.getName());

            ps.execute();
            
            System.out.println(category.toString());

            ps.close();
        }catch(Exception e) {
			System.out.println(e.getMessage());
        }
	}

	@Override
	public void supprimer(Category category) {
        try {
            PreparedStatement ps = Connect.connexion().prepareStatement("DELETE FROM Category WHERE ID_Category = " + category.getID_Category());
            ps.execute();
            ps.close();
        } catch (Exception e) {
			System.out.println(e.getMessage());
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
			System.out.println(e.getMessage());
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
			System.out.println(e.getMessage());
        }
	}

}
