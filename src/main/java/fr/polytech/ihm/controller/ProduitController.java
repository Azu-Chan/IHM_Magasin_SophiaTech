package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;


/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    @FXML
    private TableView tableView;
    @FXML
    public void initialize() throws IOException {
        if (langue == true)
            anglais();
    }

    public void anglais() {
        super.anglais();
        langue=true;
        lettre.setText("P");
        suite.setText("roducts");
        ((TableColumn) tableView.getColumns().get(0)).setText("Designation");
        ((TableColumn) tableView.getColumns().get(1)).setText("Category");
        ((TableColumn) tableView.getColumns().get(2)).setText("in stock?");
        ((TableColumn) tableView.getColumns().get(4)).setText("price");
    }
}
