package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * Created by dziri on 08/03/17.
 */
public class QSNController extends MenuController {
	@FXML
	private BorderPane borderp;
	
	private WebEngine webEngine;
	
    @FXML
    public void initialize(){
        if(langue)
            this.anglais();
        
        WebView webView = new WebView();
        webView.getEngine().load("https://luscious.net/c/trap_manga/");
        
        borderp.setCenter(webView);
    }
    @Override
    public void anglais(){
        lettre.setText("W");
        suite.setText("ho we are ?");
        super.anglais();
    }
}
