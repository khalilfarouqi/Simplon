package application;
	
import Models.Message_Box;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public Message_Box Msg_Box = new Message_Box();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("/View/Login.fxml")));
			
			primaryStage.setTitle("Login");

			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			scene.setFill(Color.TRANSPARENT);
			
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			Msg_Box.message_box(e, "Main");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
