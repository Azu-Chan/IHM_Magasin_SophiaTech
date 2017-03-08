package fr.polytech.ihm.controller;

import javafx.fxml.FXML;

/**
 * Created by dziri on 08/03/17.
 */
public class QSNController extends MenuController {
    @FXML
    public void initialize(){
        if(langue)
            this.anglais();
    }
    @Override
    public void anglais(){
        lettre.setText("W");
        suite.setText("ho we are ?");
        super.anglais();
    }
}
