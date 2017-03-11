package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by dziri on 11/03/17.
 */
public class DescController {
    @FXML
    private Button button;
    @FXML
    public void initialize(){
        button.setText("Acheter");
        button.setStyle("-fx-font: 22 arial; -fx-base: #003694;");
        if(MenuController.langue){
            button.setText("Buy");
        }
    }

}
