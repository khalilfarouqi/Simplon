package Models;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Form {
	
	public Form() {}
	
	public Stage primaryStage;
	public Message_Box Msg_Box = new Message_Box();
	
	public void Open_Form(String Local) {
		try {
			Scene scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("/View/" + Local + ".fxml")));
			
			primaryStage = new Stage();
			

			scene.setFill(Color.TRANSPARENT);

			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch (Exception e) {
			Msg_Box.message_box(e, "Form");
		}
	}
}
