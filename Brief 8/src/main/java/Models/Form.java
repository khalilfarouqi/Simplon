package Models;

import com.example.test.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Form {
    public Form() {}

    public Stage stage;
    public Message_Box Msg_Box = new Message_Box();

    public void Open_Form(String Local) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(Local+".fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage=new Stage();
            scene.setFill(Color.TRANSPARENT);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            Msg_Box.message_box(e, "Form");
        }
    }
}
