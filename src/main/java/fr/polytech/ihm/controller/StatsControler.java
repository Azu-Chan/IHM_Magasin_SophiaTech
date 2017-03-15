package fr.polytech.ihm.controller;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class StatsControler {
	@FXML
    private ImageView toBeOrToHave;
	
	@FXML
	private BorderPane borderp;
	
    @FXML
    public void initialize(){
    	WebView webView = new WebView();
        URL url;
        
        url = getClass().getResource("/HTML_admin/stats.html");
        
        webView.getEngine().load(url.toExternalForm());
        
        borderp.setCenter(webView);
    }
    
    public void retour() throws IOException {
        Stage stage=(Stage) toBeOrToHave.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/admin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
