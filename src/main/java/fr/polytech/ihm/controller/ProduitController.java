package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.List;


/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    private int i = 0;
    @FXML
    private TableView tableView;
    @FXML
    private ChoiceBox<String> choiceBox;
    
    @FXML
    public void initialize() throws IOException {
        if (langue == true)
            anglais();
        initP();

    }


    public void anglais() {
        super.anglais();
        langue=true;
        lettre.setText("P");
        suite.setText("roducts");
    }


     public void initP(){
    	 choiceBox.setItems(Modele.getCategories());

         List<Produit> produit = Modele.getProducts();
         TableColumn<Produit, String> titre = new TableColumn<>("Titre");
         titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
         titre.setMinWidth(200);

         TableColumn<Produit, String> stock = new TableColumn<>("Stock");
         stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
         stock.setMinWidth(200);

         TableColumn<Produit, String> description = new TableColumn<>("Description");
         description.setCellValueFactory(new PropertyValueFactory<>("description"));
         description.setMinWidth(200);

         TableColumn<Produit, String> promotion = new TableColumn<>("Promotion");
         promotion.setCellValueFactory(new PropertyValueFactory<>("promotion"));
         promotion.setMinWidth(200);

         TableColumn<Produit, String> prix = new TableColumn<>("Prix");
         prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
         prix.setMinWidth(200);

         TableColumn<Produit, String> nom = new TableColumn<>("Type");
         nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
         nom.setMinWidth(200);

         TableColumn<Produit, ImageView> cheminImage = new TableColumn<>("Image");
         cheminImage.setCellValueFactory(new PropertyValueFactory<>("cheminImage"));
         cheminImage.setMinWidth(200);
         tableView.getColumns().addAll(cheminImage,nom,titre,stock,promotion,prix,description);
         tableView.setItems(Modele.getProducts());
         tableView.setVisible(true);
     }
}
