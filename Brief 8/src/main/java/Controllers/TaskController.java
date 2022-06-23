package Controllers;

import DAO_Brief.DAO_Category;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import DAO_Brief.DAO_Task;
import Models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.ComboBox;

import javafx.scene.control.TextArea;

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;

public class TaskController implements Initializable {

    ObservableList<String> option = FXCollections.observableArrayList("pas encore","en cours","terminée");

    public ObservableList<Category> getCandidatList(){

        ObservableList<Category> CategoryList = FXCollections.observableArrayList();

        try{
            DAO_category.Remp_Combobox(category, CategoryList);
        }catch(Exception e){
            Msg_Box.message_box(e,"Obervablelist Controller task");;
        }
        return CategoryList;
    }


    @FXML
    private Button ID_Button_Close, ID_Button_Add, ID_Button_Delete, ID_Button_Update;
    @FXML
    private TextField ID_TextField_Title, ID_TextField_ID;
    @FXML
    private ComboBox<String> ID_Combobox_Status = new ComboBox(option);
    @FXML
    private ComboBox<Category> ID_Combobox_Category  = new ComboBox(option);
    @FXML
    private DatePicker ID_DatePicker;
    @FXML
    private TextArea ID_TextArea_Desc;

    private Stage primaryStage;
    private Task task;

    private Category category;
    private DAO_Task DAO_task = new DAO_Task();

    private DAO_Category DAO_category = new DAO_Category();
    private Message_Box Msg_Box = new Message_Box();

	/*public ObservableList<Task> getCandidatList(){

        ObservableList<Task> candidatList = FXCollections.observableArrayList();

        try{
        	DAO_task.Remp_Observe(task, candidatList);
        }catch(Exception e){
            Msg_Box.message_box(e,"Obervablelist Controller");;
        }
        return candidatList;
    }

	public void AfficheCandidats(){
		ID_Button_TableView.getItems().clear();

		ObservableList<Task> list =getCandidatList();

		Column_ID.setCellValueFactory(new PropertyValueFactory<Task,String>("ID"));
		Column_Title.setCellValueFactory(new PropertyValueFactory<Task,String>("Title"));
		Column_Discription.setCellValueFactory(new PropertyValueFactory<Task,String>("Discription"));
		Column_Status.setCellValueFactory(new PropertyValueFactory<Task,String>("Status"));
		Column_DeadLine.setCellValueFactory(new PropertyValueFactory<Task,String>("Deadline"));
		Column_Category.setCellValueFactory(new PropertyValueFactory<Task,String>("Category"));

		ID_Button_TableView.setItems(list);
	}*/


    public void AfficheCandidats(){
        ID_Combobox_Category.getItems().clear();

		ObservableList<Category> list = getCandidatList();

		ID_Combobox_Category.setItems(list);
    }

    public void Clean() {
        ID_TextField_Title.setText("");
        ID_TextField_ID.setText("");
        ID_Combobox_Category.setValue(null);
        ID_Combobox_Status.setValue(null);
        ID_DatePicker.setValue(null);
    }

    // Event Listener on Button[#ID_Button_Close].onAction
    @FXML
    public void OnClickClose(ActionEvent event) {
        // TODO Autogenerated

        primaryStage = (Stage) ID_Button_Close.getScene().getWindow();

        primaryStage.close();
    }
    @FXML
    public void OnClickAdd(ActionEvent event) {
        try {
            task = new Task();

            DAO_task.lister(task);

            task.setTitle(ID_TextField_Title.getText());
            task.setDescription(ID_TextArea_Desc.getText());
            task.setStatus(ID_Combobox_Status.getValue());
            task.setDeadline(ID_DatePicker.getValue());
            //task.setID_Category(Integer.parseInt(ID_Combobox_Category.getValue()));

            DAO_task.Ajouter(task);

            Connect.connexion().close();

            Clean();
            //AfficheCandidats();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Ajouter Controller");
        }
    }
    @FXML
    public void OnClickDelete(ActionEvent event) {
        try {

            //TableView_Aff.getItems().remove(TableView_Aff.getSelectionModel().getSelectedItem());

            task = new Task();

            task.setID_task(Integer.parseInt(ID_TextField_ID.getText()));


            DAO_task.supprimer(task);


            Connect.connexion().close();

            Clean();

            //AfficheCandidats();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Supprimer Controller");
        }
    }
    @FXML
    public void OnClickUpdate(ActionEvent event) {
        try {

            task = new Task();


            task.setID_task(Integer.parseInt(ID_TextField_ID.getText()));
            task.setTitle(ID_TextField_Title.getText());
            task.setDescription(ID_TextArea_Desc.getText());
            task.setStatus(ID_Combobox_Status.getValue());
            task.setDeadline(ID_DatePicker.getValue());
            //task.setID_Category(Integer.parseInt(ID_Combobox_Category.getValue()));

            DAO_task.modifier(task);

            Connect.connexion().close();

            Clean();

            //AfficheCandidats();
        }catch(Exception e) {
            Msg_Box.message_box(e,"Modifier Controller");
        }

    }
    // Event Listener on TextField[#ID_TextField_Title].onKeyPressed
    @FXML
    public void OnKeyPressed_Title(KeyEvent event) {
        // TODO Autogenerated
        ID_TextField_Title.setStyle("-fx-background-color: White;");
    }
    @FXML
    public void OnKeyPressed_Id(KeyEvent event) {
        // TODO Autogenerated
        ID_TextField_ID.setStyle("-fx-background-color: White;");

    }
    // Event Listener on ComboBox[#ID_Combobox_Category].onAction
    @FXML
    public void OnClick_Category(ActionEvent event) {
        // TODO Autogenerated
        ID_Combobox_Category.setStyle("-fx-background-color: White;");
    }
    // Event Listener on DatePicker[#ID_DatePicker].onAction
    @FXML
    public void OnClick_DeadLine(ActionEvent event) {
        // TODO Autogenerated
        ID_DatePicker.setStyle("-fx-background-color: White;");
    }
    // Event Listener on ComboBox[#ID_Combobox_Status].onAction
    @FXML
    public void OnClick_Status(ActionEvent event) {
        // TODO Autogenerated
        ID_Combobox_Status.setStyle("-fx-background-color: White;");
    }
    // Event Listener on TextArea[#ID_TextArea_Desc].onKeyPressed
    @FXML
    public void OnKeyPressed_Description(KeyEvent event) {
        // TODO Autogenerated
        ID_TextArea_Desc.setStyle("-fx-background-color: White;");
    }

    public void initialize(URL arg0, ResourceBundle arg1) {
        ID_Combobox_Status.setItems(option);
        AfficheCandidats();
    }
}
