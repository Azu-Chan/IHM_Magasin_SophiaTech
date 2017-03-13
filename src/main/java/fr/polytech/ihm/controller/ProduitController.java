package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
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
    private TextArea description;
    @FXML
    private TextField titre;
    @FXML
    private TextField nbp;
    @FXML
    private TextField promotion;
    @FXML
    private TextField prix;
    @FXML
    private TextField image;
    @FXML
    private TextField type;
    
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

         List<Produit> produit = Modele.getProducts();
         TableColumn<Produit, Label> titre = new TableColumn<>("Titre");
         titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
         titre.setMinWidth(200);

         TableColumn<Produit, Label> stock = new TableColumn<>("Stock");
         stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
         stock.setMinWidth(200);

         TableColumn<Produit, Label> description = new TableColumn<>("Description");
         description.setCellValueFactory(new PropertyValueFactory<>("description"));
         description.setMinWidth(200);

         TableColumn<Produit, Label> promotion = new TableColumn<>("Promotion");
         promotion.setCellValueFactory(new PropertyValueFactory<>("promotion"));
         promotion.setMinWidth(200);

         TableColumn<Produit, Label> prix = new TableColumn<>("Prix");
         prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
         prix.setMinWidth(200);

         TableColumn<Produit, Label> nom = new TableColumn<>("Type");
         nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
         nom.setMinWidth(200);

         TableColumn<Produit, ImageView> cheminImage = new TableColumn<>("Image");
         cheminImage.setCellValueFactory(new PropertyValueFactory<>("cheminImage"));
         cheminImage.setMinWidth(200);
         tableView.getColumns().addAll(cheminImage,nom,titre,stock,promotion,prix,description);
         tableView.setItems(Modele.getProducts());
         tableView.setVisible(true);
     }
    public void modif(){
        tableView.getSelectionModel().setCellSelectionEnabled(true);
        Object selectedCells = tableView.getSelectionModel().getSelectedItem();
        Produit produitSelect = (Produit)selectedCells;

        produitSelect.getTitre().setText(titre.getText());
        produitSelect.getNom().setText(type.getText());
        produitSelect.getStock().setText(nbp.getText());
        produitSelect.getPromotion().setText(promotion.getText());
        produitSelect.getPrix().setText(prix.getText());
        produitSelect.getDescription().setText(description.getText());
        produitSelect.getCheminImage().setImage(new Image(image.getText()));

        image.setText("");
        titre.setText("");
        nbp.setText("");
        prix.setText("");
        promotion.setText("");
        description.setText("");
        type.setText("");
    }
    public void sup(){
        tableView.getSelectionModel().setCellSelectionEnabled(true);
        Object selectedCells = tableView.getSelectionModel().getSelectedItem();
        Produit produitSelect = (Produit)selectedCells;
       Modele.getProducts().remove(produitSelect);
    }
}
