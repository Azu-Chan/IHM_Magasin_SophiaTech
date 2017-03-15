package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by dziri on 15/03/17.
 */
public class ContactController extends MenuController {
    @FXML
    private Label lettre;
    @FXML
    private Label suite;
    @FXML
    private Label lable;
    @FXML
    public void initialize(){
        if(langue)
            anglais();
    }
    public void anglais(){
        langue=true;
        super.anglais();
        lettre.setText("C");
        suite.setText("ontact us");
        lient1.setText("Qui sommes nous ?");
        lient2.setText("En savoir plus");
        lable.setText("Your message will be processed as soon as possible, you will receive a reply on the entered e-mail address.");
        lient2.setText("To knew more");
        lient1.setText("Who we are ?");
    }
}
