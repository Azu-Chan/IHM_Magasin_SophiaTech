package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Created by dziri on 12/03/17.
 */
public class AjoutControler {
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

    public void valider() throws IOException {
        Modele.getProducts().add(new Produit(description.getText(), titre.getText(), nbp.getText(), promotion.getText(), prix.getText(), chemain.getText(), nom.getText()));
        System.out.println("sqdsdssqdqsd");
        chemain.setText("");
        titre.setText("");
        nbp.setText("");
        prix.setText("");
        promotion.setText("");
        description.setText("");
        nom.setText("");
    }
}
