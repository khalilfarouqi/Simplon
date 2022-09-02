package application;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Alert;


public class Main extends Application {	
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/View/Login.fxml")));
			
			primaryStage.setTitle("Gestion de Produit");
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Message Here...");
			alert.setContentText(e.getMessage());
			alert.show();
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
