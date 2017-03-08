package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by dziri on 28/02/17.
 */
public class MenuController {

    @FXML
    protected Label lettre;
    @FXML
    protected Label suite;
    @FXML
    protected Button button1;
    @FXML
    protected Button button2;
    @FXML
    protected Button button3;
    @FXML
    protected Button button4;
    static protected boolean langue;
    @FXML
    private ImageView toBeOrToHave;
    public void produit() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/produits.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void accueil() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/accueil.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void quiSommesNous() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Qui_sommes_nous.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void toBeOrToHave(){
        System.out.println("jjjjjjjjjjjjjjj");
    }
}
