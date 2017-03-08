package fr.polytech.ihm;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;




/**
 * Created by dziri on 05/03/17.
 */
public class ProduitController extends MenuController {
    @FXML
    private TableView tableView;
    @FXML
    public void initialize(){
        if (langue == true)
            anglais();
    }

    public void anglais() {
        langue=true;
        lettre.setText("H");
        suite.setText("ome");
        button1.setText("Home");
        button2.setText("Who are we?");
        button3.setText("Product");
        ((TableColumn) tableView.getColumns().get(0)).setText("Designation");
        ((TableColumn) tableView.getColumns().get(1)).setText("Category");
        ((TableColumn) tableView.getColumns().get(2)).setText("in stock?");
        ((TableColumn) tableView.getColumns().get(4)).setText("price");
    }
}
