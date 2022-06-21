package application;
	
import Models.Form;
import Models.Message_Box;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Form Open_For = new Form();
		Open_For.Open_Form("Login");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
