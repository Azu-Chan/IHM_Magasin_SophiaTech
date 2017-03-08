package fr.polytech.ihm.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
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

            ObservableList<String> items = FXCollections.observableArrayList (
                    "RUBY", "APPLE", "VISTA", "TWITTER");
            listView.setItems(items);
            listView.setCellFactory((Object param) -> {
                return new ListCell<String>() {
                    private BorderPane imageView = new BorderPane();

                    @Override
                    public void updateItem(String name, boolean empty) {
                        super.updateItem(name, empty);
                        if (empty) {
                            setText(null);
                            setGraphic(null);
                        } else {

                            //imageView.setImage(new Image("/images/produits/louane.jpg"));
                            //imageView.setImage(new Image("/images/produits/nirvana.jpg"));
                            //imageView.setImage(new Image("/images/produits/nirvana.jpg"));
                            //imageView.setImage(new Image("/images/produits/louane.jpg"));

                            setText(name);
                            setGraphic(imageView);
                            try {
                                imageView.setCenter(new FXMLLoader(getClass().getResource("/fxml/accueil.fxml")).load());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            setGraphic(imageView);
                        }
                    }
                };
            });


        }


    public void anglais() {
        super.anglais();
        langue=true;
        lettre.setText("P");
        suite.setText("roducts");
        //((TableColumn) tableView.getColumns().get(0)).setText("Designation");
        //((TableColumn) tableView.getColumns().get(1)).setText("Category");
        //((TableColumn) tableView.getColumns().get(2)).setText("in stock?");
        //((TableColumn) tableView.getColumns().get(4)).setText("price");
    }
}
