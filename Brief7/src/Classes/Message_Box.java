package Classes;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Message_Box {
	
	@FXML
	private TextField textField_Id, textField_Nom, textField_Prenom, textField_MAil, textField_Adresse, textField_Ville, textField_Pays;
	
	public Message_Box() {}
	
	public void message_box(Exception e) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Message Here...");
	    alert.setHeaderText("Une Erreur");
	    alert.setContentText(e.getMessage());
	    alert.showAndWait();
	}
	public void Clean() {
		textField_Id.clear();
		textField_Nom.clear();
		textField_Prenom.clear();
		textField_MAil.clear();
		textField_Adresse.clear();
		textField_Ville.clear();
		textField_Pays.clear();
	}
}
