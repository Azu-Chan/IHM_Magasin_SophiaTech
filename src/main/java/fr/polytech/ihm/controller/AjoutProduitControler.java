package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by dziri on 14/03/17.
 */
public class AjoutProduitControler {
    @FXML
    private TextField chemain;
    @FXML
    private TextField titre;
    @FXML
    private TextField nbp;
    @FXML
    private TextField prix;
    @FXML
    private TextField promotion;
    @FXML
    private TextArea description;
    @FXML
    private TextField nom;
    @FXML
    private ImageView toBeOrToHave;
    
    public void valider() throws IOException {
        Modele.getProducts().add(new Produit(description.getText(), titre.getText(), nbp.getText(), promotion.getText(), prix.getText(), chemain.getText(), nom.getText()));
        chemain.setText("");
        titre.setText("");
        nbp.setText("");
        prix.setText("");
        promotion.setText("");
        description.setText("");
        nom.setText("");
    }
    
    public void retour() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
