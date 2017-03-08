package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    @FXML
    private ListView<Produit> listView;
    @FXML
    public void initialize(){
        if (langue == true)
            anglais();
        
        listView.getItems().setAll(Modele.getProducts());
    }

    public void anglais() {
        langue=true;
        lettre.setText("P");
        suite.setText("roducts");
        button1.setText("Home");
        button2.setText("Who are we?");
        button3.setText("Product");
    }
}
