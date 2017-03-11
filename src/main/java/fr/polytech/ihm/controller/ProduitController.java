package fr.polytech.ihm.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;


/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    @FXML
    private ListView listView;
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
         ObservableList<String> items = FXCollections.observableArrayList (
                 "1", "2","3");
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
                             case "1":
                                 setGraphic(borderPane);
                                 ((ImageView) borderPane.getLeft()).setImage(new Image("/images/produits/nirvana.jpg"));
                                 Label label = new Label("azassqsqsd\nqddsqdqsd\n\n\nfssdfdfsdf");
                                 label.setWrapText(true);
                                 label.setAlignment(Pos.CENTER);
                                 borderPane.setCenter(label);
                                 break;
                             case "2":
                                 setGraphic(borderPane);
                                 ((ImageView) borderPane.getLeft()).setImage(new Image("/images/produits/louane.jpg"));
                                 Label label1 = new Label("azassqsqsd\nqddsqdqsd\n\n\nfssdfdfsdf");
                                 label1.setWrapText(true);
                                 label1.setAlignment(Pos.CENTER);
                                 borderPane.setCenter(label1);
                                 break;
                             case "3":
                                 setGraphic(borderPane);
                                 ((ImageView) borderPane.getLeft()).setImage(new Image("/images/produits/Opticks.jpg"));
                                 Label label2 = new Label("azassqsqsd\nqddsqdqsd\n\n\nfssdfdfsdf");
                                 label2.setWrapText(true);
                                 label2.setAlignment(Pos.CENTER);
                                 borderPane.setCenter(label2);
                                 break;


                         }
                         //borderPane.setCenter(borderPane);
                         setGraphic(borderPane);
                     }
                 }
             };
         });


     }
}
