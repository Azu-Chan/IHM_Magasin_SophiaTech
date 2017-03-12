package fr.polytech.ihm.controller;

import fr.polytech.ihm.modele.Modele;
import fr.polytech.ihm.modele.Produit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.List;


/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    private int i = 0;
    @FXML
    private ListView listView;
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
         List<Produit> produit = Modele.getProducts();
         ObservableList<String> items = FXCollections.observableArrayList (
                 "3","4");
         listView.setItems(items);
         listView.setCellFactory((Object param) -> {
             return new ListCell<String>() {
                 private BorderPane borderPane;
                 @Override
                 public void updateItem(String name, boolean empty) {
                     super.updateItem(name, empty);
                     if (empty) {
                         setText(null);
                         setGraphic(null);
                     } else {
                         try {
                             borderPane =new FXMLLoader(getClass().getResource("/fxml/description_produit.fxml")).load();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                         switch(name) {
                             case "3":
                                 setGraphic(borderPane);
                                 ((ImageView) borderPane.getLeft()).setImage(new Image("/images/produits/Opticks.jpg"));
                                 Label label2 = new Label("azassqsqsd\nqddsqdqsd\n\n\nfssdfdfsdf");
                                 label2.setWrapText(true);
                                 label2.setAlignment(Pos.CENTER);
                                 borderPane.setCenter(label2);
                                 break;
                             case "4":
                                 setGraphic(borderPane);
                                 ((ImageView) borderPane.getLeft()).setImage(new Image(produit.get(i).getCheminImage()));
                                 Label label3 = new Label("description du produit : "+produit.get(i).getDescription()+
                                 "\ntype : "+produit.get(i).getNom()+"\ntitre : "+produit.get(i).getTitre()+"\nprix : "+produit.get(i).getPrix()+"£"+
                                 "\npromotion : "+produit.get(i).getPromotion()+"%"+"\nen stock : "+produit.get(i).getStock());
                                 label3.setWrapText(true);
                                 label3.setAlignment(Pos.CENTER);
                                 borderPane.setCenter(label3);
                                 if(i < produit.size()-1){
                                     items.add("4");
                                     i++;
                                 }
                                 break;
                                 default:break;



                         }
                         //System.out.println(name);
                         //borderPane.setCenter(borderPane);
                         setGraphic(borderPane);
                     }
                 }
             };
         });

         
         choiceBox.setItems(Modele.getCategories());
     }
}
