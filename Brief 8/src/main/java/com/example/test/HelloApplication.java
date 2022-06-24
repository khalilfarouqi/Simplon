package com.example.test;

import Models.Form;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Form Open_For = new Form();
        //Open_For.Open_Form("Login");
        Open_For.Open_Form("Login");
    }

    public static void main(String[] args) {
        launch();
    }
}