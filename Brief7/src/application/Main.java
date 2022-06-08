package application;
	
import java.text.MessageFormat;

import javax.annotation.processing.Messager;
import javax.print.attribute.standard.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {	
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().load(getClass().getResource("Form.fxml"));
			
			/*TableView<UserAccount> table = new TableView<UserAccount>();

		      // Create column UserName (Data type of String).
		      TableColumn<UserAccount, String> userNameCol = new TableColumn<UserAccount, String>("User Name");

		      // Create column Email (Data type of String).
		      TableColumn<UserAccount, String> emailCol = new TableColumn<UserAccount, String>("Email");

		      // Create column FullName (Data type of String).
		      TableColumn<UserAccount, String> fullNameCol = new TableColumn<UserAccount, String>("Full Name");

		      // Create 2 sub column for FullName.
		      TableColumn<UserAccount, String> firstNameCol = new TableColumn<UserAccount, String>("First Name");

		      TableColumn<UserAccount, String> lastNameCol = new TableColumn<UserAccount, String>("Last Name");
		      
		      // Add sub columns to the FullName
		      fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);

		      // Active Column
		      TableColumn<UserAccount, Boolean> activeCol = new TableColumn<UserAccount, Boolean>("Active");

		      table.getColumns().addAll(userNameCol, emailCol, fullNameCol, activeCol);

		      StackPane root = new StackPane();
		      root.setPadding(new Insets(5));
		      root.getChildren().add(table);

		      stage.setTitle("TableView (o7planning.org)");*/

			
			
			
			Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("Gestion de Produit");
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
