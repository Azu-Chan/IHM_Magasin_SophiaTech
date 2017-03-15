package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by dziri on 11/03/17.
 */
public class AdminController {
    @FXML
    private ImageView toBeOrToHave;
    @FXML
    public void initialize(){

    }
    public void ajout() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ajoutP.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void modifP() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ModifierP.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void supP() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/supP.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void showStats() throws IOException {
    	Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/stats.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void showMessages() throws IOException {
    	Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/messagesAdmin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
