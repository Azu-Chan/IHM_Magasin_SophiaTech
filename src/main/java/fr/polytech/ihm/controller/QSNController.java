package fr.polytech.ihm.controller;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

/**
 * Created by dziri on 08/03/17.
 */
public class QSNController extends MenuController {
	@FXML
	private BorderPane borderp;
	
    @FXML
    public void initialize(){
        if(langue)
            this.anglais();
        
        WebView webView = new WebView();
        URL url = getClass().getResource("/HTML/qsn.html");
        webView.getEngine().load(url.toExternalForm());
        
        borderp.setCenter(webView);
    }
    @Override
    public void anglais(){
        lettre.setText("W");
        suite.setText("ho we are ?");
        super.anglais();
    }
}
