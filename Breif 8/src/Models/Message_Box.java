package Models;

import javafx.scene.control.Alert;

public class Message_Box {
	
	public Message_Box() {}
	
	public void message_box(Exception e,String where) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Message Here...");
	    alert.setHeaderText(where);
	    alert.setContentText(e.getMessage());
	    alert.showAndWait();
	}
	
}
