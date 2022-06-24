package Controllers;

import DAO_Brief.DAO_Category;
import Models.Category;
import Models.Connect;
import Models.Message_Box;
import Models.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CategoryController implements Initializable {

    @FXML
    private Button Id_Button_Close, Id_Button_New, Id_Button_Delete, Id_Button_Update;

    @FXML
    private TableView<Category> Id_TableView;

    @FXML
    private TableColumn<Category, Integer> Id_Column_ID;

    @FXML
    private TableColumn<Category, String> Id_Column_Name;

    @FXML
    private TextField Id_TextField_ID, Id_TextField_Name;

    private Message_Box Msg_Box = new Message_Box();
    private DAO_Category DAO_category = new DAO_Category();
    private Category category = new Category();
    private Stage primaryStage;

    public ObservableList<Category> getCandidatList(){

        ObservableList<Category> candidatList = FXCollections.observableArrayList();

        try{
            DAO_category.Remp_Combobox(category, candidatList);
        }catch(Exception e){
            Msg_Box.message_box(e,"Obervablelist Controller Category");
        }
        return candidatList;
    }

    public void AfficheCandidats(){

        //Id_TableView.getItems().clear();

        ObservableList<Category> list = getCandidatList();

        try {
            Id_Column_ID.setCellValueFactory(new PropertyValueFactory<>("ID_Category"));
            Id_Column_Name.setCellValueFactory(new PropertyValueFactory<>("Name"));

            Id_TableView.setItems(list);
        }catch (Exception e){
            Msg_Box.message_box(e,"");
        }
    }
    private void Clean(){
        Id_TextField_ID.setText("");
        Id_TextField_Name.setText("");
    }
    @FXML
    void OnAction_Close(ActionEvent event) {
        primaryStage = (Stage) Id_Button_Close.getScene().getWindow();

        primaryStage.close();
    }

    @FXML
    void OnAction_Delete(ActionEvent event) throws SQLException {
        if (Id_TextField_ID.isVisible()){
            try {
                category.setID_Category(Integer.parseInt(Id_TextField_ID.getText()));

                DAO_category.supprimer(category);

                Connect.connexion().close();

                Clean();
                Id_TextField_ID.setStyle("visibility: false;");
            }catch (Exception e){
                Msg_Box.message_box(e,"Controller Category Delete");
            }
        }else {
            Id_TextField_ID.setStyle("visible: true;");
        }
    }

    @FXML
    void OnAction_New(ActionEvent event) {
        if (Id_TextField_ID.isVisible()){
            if (Id_TextField_ID.getText() == null || Id_TextField_Name.getText() == "") {
                if(Id_TextField_ID.getText() == null)Id_TextField_ID.setStyle("-fx-background-color: Red;");
                if(Id_TextField_Name.getText() == "")Id_TextField_Name.setStyle("-fx-background-color: Red;");
            }else {
                try {
                    DAO_category.lister(category);
                    category.setID_Category(Integer.parseInt(Id_TextField_ID.getText()));
                    category.setName(Id_TextField_Name.getText());
                    DAO_category.Ajouter(category);
                    AfficheCandidats();

                    Id_TextField_ID.setStyle("visibility: false;");
                    Id_TextField_Name.setStyle("visibility: false;");

                    Clean();

                } catch (Exception e) {
                    Msg_Box.message_box(e, "ajouter Controller");
                }
            }
        }else {
            Id_TextField_ID.setStyle("visible: true;");
            Id_TextField_Name.setStyle("visible: true;");
        }


    }

    @FXML
    void OnAction_Update(ActionEvent event) {
        if (Id_TextField_ID.isVisible()) {
            try {

                category.setID_Category(Integer.parseInt(Id_TextField_ID.getText()));
                category.setName(Id_TextField_Name.getText());

                DAO_category.modifier(category);

                Connect.connexion().close();

                Id_TextField_ID.setStyle("visibility: false;");
                Id_TextField_Name.setStyle("visibility: false;");

                Clean();
            }catch(Exception e) {
                Msg_Box.message_box(e,"Update Controller category");
            }
        }else {
            Id_TextField_ID.setStyle("visible: true;");
            Id_TextField_Name.setStyle("visible: true;");
        }
    }
    @FXML
    void OnKeyPressedID(KeyEvent event) {
        Id_TextField_ID.setStyle("-fx-background-color: White;");
    }

    @FXML
    void OnKeyPressedName(KeyEvent event) {
        Id_TextField_Name.setStyle("-fx-background-color: White;");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AfficheCandidats();
    }
}