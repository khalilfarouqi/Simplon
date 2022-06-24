package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import DAO_Brief.*;
import Models.*;
import javafx.collections.*;
import javafx.event.ActionEvent;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class HomeController implements Initializable {
    @FXML
    private Button ID_Button_Edit, Id_Button_Close;
    @FXML
    private TableView<Task> ID_Button_TableView;
    @FXML
    private TableColumn<Task, String> Column_Title, Column_Discription, Column_Status, Column_DeadLine;
    @FXML
    private TableColumn<Task, Integer> Column_ID, Column_Category;

    @FXML
    private Label ID_Label;

    private Message_Box Msg_Box = new Message_Box();
    private Task task = new Task();
    private DAO_Task DAO_task = new DAO_Task();
    private Stage primaryStage;
    private Form open_Form = new Form();



    public ObservableList<Task> getCandidatList(){

        ObservableList<Task> candidatList = FXCollections.observableArrayList();

        try{
            DAO_task.Remp_Observe(task, candidatList);
        }catch(Exception e){
            Msg_Box.message_box(e,"Obervablelist Controller");
        }
        return candidatList;
    }

    public void AfficheCandidats(){

        ID_Label.setText(LoginController.Name);

        //ID_Button_TableView.getItems().clear();

        ObservableList<Task> list = getCandidatList();
        Column_ID.setCellValueFactory(new PropertyValueFactory<Task,Integer>("ID_task"));
        Column_Title.setCellValueFactory(new PropertyValueFactory<Task,String>("Title"));
        Column_Discription.setCellValueFactory(new PropertyValueFactory<Task,String>("Description"));
        Column_Status.setCellValueFactory(new PropertyValueFactory<Task,String>("Status"));
        Column_DeadLine.setCellValueFactory(new PropertyValueFactory<Task,String>("Deadline"));
        Column_Category.setCellValueFactory(new PropertyValueFactory<Task,Integer>("ID_Category"));

        ID_Button_TableView.setItems(list);
    }

    @FXML
    public void OnClick_Edit(ActionEvent event) {
        // TODO Autogenerated
        open_Form.Open_Form("Task");
    }
    // Event Listener on Button[#Id_Button_Close].onAction
    @FXML
    public void OnClickClose(ActionEvent event) {
        primaryStage = (Stage) Id_Button_Close.getScene().getWindow();

        primaryStage.close();
    }

    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            AfficheCandidats();
        } catch (Exception e) {
            Msg_Box.message_box(e, "Initialize");
        }
    }
}
