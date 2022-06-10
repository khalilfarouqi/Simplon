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

			//Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Form.fxml")));
			
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
