package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import fr.polytech.ihm.modele.Message;
import fr.polytech.ihm.modele.Modele;
import javafx.event.*;

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
    private TextField mailText;
    @FXML
    private TextArea contentText;
    @FXML
    private Button envoyer;
    @FXML
    public void initialize(){
        if(langue)
            anglais();
        
        envoyer.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent arg0) {
				boolean ok = true;
				
				if(mailText.getText().replaceAll(" |\t", "").length() == 0)
					ok = false;
				
				if(contentText.getText().replaceAll(" |\n|\t", "").length() == 0)
					ok = false;
				
				if(ok){
					Modele.getMessages().add(new Message(mailText.getText(), contentText.getText()));
					mailText.clear();
					contentText.clear();
				}
			}
        });
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
